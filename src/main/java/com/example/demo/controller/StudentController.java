package com.example.demo.controller;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class StudentController{
@AutoWired StudentService ser;
  
    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity ent){
        return ser.postData(ent);
    }

}