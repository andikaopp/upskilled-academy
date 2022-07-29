package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.dto.CreateUserDto;
import com.ecommerce.ecommerce.dto.DeleteUserDto;
import com.ecommerce.ecommerce.dto.UpdateUserDto;
import com.ecommerce.ecommerce.errorresponse.ErrorResponse;
import com.ecommerce.ecommerce.model.User;
import com.ecommerce.ecommerce.repository.UserRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
@Transactional(rollbackOn = Exception.class)
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> create(CreateUserDto dto){

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<String, Object>();

        User user = new User();
        user.setUsername(dto.getUsername().trim());
        user.setPhone(dto.getPhone().trim());
        user.setAddress(dto.getAddress().trim());

        userRepository.save(user);

        res.put("code", 201);
        res.put("message", "success");
        res.put("data", user);

        return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(res);
    }

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> update(UpdateUserDto dto){

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<String, Object>();

        User user = userRepository.findById(dto.getId()).orElse(null);

        if(Optional.ofNullable(user).isPresent()){
            user.setUsername(dto.getUsername().trim());
            user.setPhone(dto.getPhone().trim());
            user.setAddress(dto.getAddress().trim());
        }else{
            ErrorResponse errorResponse = new ErrorResponse("9999", "data not found");
            return ResponseEntity.status(HttpStatus.OK).headers(headers).body(errorResponse);
        }

        userRepository.save(user);
        res.put("code", 200);
        res.put("message", "success");
        res.put("data", user);

        return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(res);
    }

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> get(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ArrayList<User> user = new ArrayList<User>(userRepository.findAll());

        if (user == null){
            ErrorResponse errorResponse = new ErrorResponse("9999", "data not found");
            return ResponseEntity.status(HttpStatus.OK).headers(headers).body(errorResponse);
        }else {
            Map<String, Object> res = new HashMap<String, Object>();
            res.put("code", 200);
            res.put("message", "success");
            res.put("data", user);

            return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
        }

    }

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> delete(DeleteUserDto dto){

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<String, Object>();

        User user = userRepository.findById(dto.getId()).orElse(null);

        if(Optional.ofNullable(user).isPresent()){
            userRepository.deleteById(dto.getId());
        }else{
            ErrorResponse errorResponse = new ErrorResponse("9999", "data not found");
            return ResponseEntity.status(HttpStatus.OK).headers(headers).body(errorResponse);
        }

        res.put("code", 200);
        res.put("message", "success deleted user");

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
    }


}
