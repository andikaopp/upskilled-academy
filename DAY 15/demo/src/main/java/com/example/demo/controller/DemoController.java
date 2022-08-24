package com.example.demo.controller;

import lombok.SneakyThrows;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

    @GetMapping("/users")
    @SneakyThrows(Exception.class)
    public ResponseEntity<Object> getUsers(){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        Map<String, Object> res = new HashMap<String, Object>();
        List<String> data = new ArrayList<String>();
        data.add("budi");
        data.add("budi");
        data.add("budi");
        data.add("budi");

        res.put("code", 200);
        res.put("message", "success");
        res.put("data", data);

        return ResponseEntity.status(HttpStatus.OK).headers(headers).body(res);

    }
}
