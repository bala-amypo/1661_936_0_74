package com.example.demo.controller;

import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;

import org.springframework.beans.factory.annotation.Autowired;
c
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class ValidationController {

    @Autowired
    private ValidationService service;

    @PostMapping("/postval")
    public ValidationEntity sendData(@Valid @RequestBody ValidationEntity entity) {
        return service.postData(entity);
    }

     @GetMapping("/getvalid/{id}")
    public ValidationEntity getdataid(@PathVariable Integer id){
        return service.getData(id);
    }
}
