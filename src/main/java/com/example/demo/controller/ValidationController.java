package com.example.demo.controller;

import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class ValidationController {

    @Autowired
    private ValidationService service;

    @PostMapping("/post")
    public ValidationEntity sendData(@Valid @RequestBody ValidationEntity entity) {
        return service.postData(entity);
    }
}
