package com.ecommerce.ecommerce.controller;

import com.ecommerce.ecommerce.dto.CreateProductDto;
import com.ecommerce.ecommerce.dto.DeleteProductDto;
import com.ecommerce.ecommerce.dto.UpdateProductDto;
import com.ecommerce.ecommerce.service.ProductService;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1")
@Slf4j
public class ProductController {

    @Autowired
    private ProductService productService;

    @SneakyThrows
    @PostMapping(path = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> create(@RequestBody CreateProductDto dto){
        log.info("api/v1/product for POST is executed....");

        return productService.create(dto);
    }

    @SneakyThrows
    @PutMapping(path = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> update(@RequestBody UpdateProductDto dto){
        log.info("api/v1/product for PUT is executed....");

        return productService.update(dto);
    }

    @SneakyThrows
    @GetMapping(path = "/product")
    public ResponseEntity<Object> get(){
        log.info("api/v1/product for GET is executed....");

        return productService.get();
    }

    @SneakyThrows
    @DeleteMapping(path = "/product", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> delete(@RequestBody DeleteProductDto dto){
        log.info("api/v1/product for DELETE is executed....");

        return productService.delete(dto);
    }
}
