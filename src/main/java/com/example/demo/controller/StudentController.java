package com.example.demo.controller;

import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService ser;

    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity ent) {
        return ser.postData(ent);
    }
}
