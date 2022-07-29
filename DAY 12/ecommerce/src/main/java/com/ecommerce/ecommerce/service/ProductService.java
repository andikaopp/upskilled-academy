package com.ecommerce.ecommerce.service;

import com.ecommerce.ecommerce.dto.CreateProductDto;
import com.ecommerce.ecommerce.dto.DeleteProductDto;
import com.ecommerce.ecommerce.dto.DeleteUserDto;
import com.ecommerce.ecommerce.dto.UpdateProductDto;
import com.ecommerce.ecommerce.errorresponse.ErrorResponse;
import com.ecommerce.ecommerce.model.Product;
import com.ecommerce.ecommerce.model.User;
import com.ecommerce.ecommerce.repository.ProductRepository;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Service
@Transactional(rollbackOn = Exception.class)
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @SneakyThrows
    public ResponseEntity<Object> create(CreateProductDto dto){

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Product product = new Product();
        product.setName(dto.getName());
        product.setPrice(dto.getPrice());
        product.setQty(dto.getQty());
        productRepository.save(product);

        Map<String, Object> res = new HashMap<String, Object>();
        res.put("code", 201);
        res.put("message", "success");
        res.put("data", product);

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
    }

    @SneakyThrows
    public ResponseEntity<Object> update(UpdateProductDto dto){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Product product = productRepository.findById(dto.getId()).orElse(null);
        if (Optional.ofNullable(product).isPresent()){
            product.setName(dto.getName().trim());
            product.setPrice(dto.getPrice());
            product.setQty(dto.getQty());
        }else {
            ErrorResponse errorResponse = new ErrorResponse("9999", "data not found");
        }

        Map<String, Object> res = new HashMap<String, Object>();
        res.put("code", 200);
        res.put("message", "success");
        res.put("data", product);

        return ResponseEntity.status(HttpStatus.CREATED).headers(headers).body(res);
    }

    @SneakyThrows
    public ResponseEntity<Object> get(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ArrayList<Product> products = new ArrayList<Product>(productRepository.findAll());

        if (products == null){
            ErrorResponse errorResponse = new ErrorResponse("9999", "data not found");
            return ResponseEntity.status(HttpStatus.OK).headers(headers).body(errorResponse);
        }else {
            Map<String, Object> res = new HashMap<String, Object>();
            res.put("code", 200);
            res.put("message", "success");
            res.put("data", products);

            return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
        }
    }

    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> delete(DeleteProductDto dto){

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<String, Object>();

        Product product = productRepository.findById(dto.getId()).orElse(null);

        if(Optional.ofNullable(product).isPresent()){
            productRepository.deleteById(dto.getId());
        }else{
            ErrorResponse errorResponse = new ErrorResponse("9999", "data not found");
            return ResponseEntity.status(HttpStatus.OK).headers(headers).body(errorResponse);
        }

        res.put("code", 200);
        res.put("message", "success deleted product");

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);
    }
}
