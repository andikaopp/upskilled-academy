package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.dto.CreateUserDto;
import com.ecommerce.ecommerce.dto.DeleteUserDto;
import com.ecommerce.ecommerce.dto.UpdateUserDto;
import com.ecommerce.ecommerce.service.UserService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @SneakyThrows(Exception.class)
    @PostMapping(path = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> create(@RequestBody CreateUserDto dto){
        log.info("api/v1/user for POST is executed...");

        return userService.create(dto);
    }

    @SneakyThrows(Exception.class)
    @PutMapping(path = "/user", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> update(@RequestBody UpdateUserDto dto){
        log.info("api/v1/user for PUT is executed...");

        return userService.update(dto);
    }

    @SneakyThrows
    @GetMapping("/user")
    public ResponseEntity<Object> get(){
        log.info("api/v1/user for GET is executed...");

        return userService.get();
    }

    @SneakyThrows
    @DeleteMapping("/user")
    public ResponseEntity<Object> delete(@RequestBody DeleteUserDto dto){
        log.info("api/v1/user for DELETE is executed...");

        return userService.delete(dto);
    }
}
