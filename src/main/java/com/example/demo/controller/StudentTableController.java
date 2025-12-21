package com.example.demo.controller;
import com.example.demo.service.StudentTableService;
import com.example.demo.entity.StudentTableEntity;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
@RestController
public class StudentTableController{
@Autowired StudentTableService stable;
  
    @PostMapping("/postforStudentTable")
    public StudentTableEntity sendData(@RequestBody StudentTableEntity Enti){
        return stable.postData(Enti);
    }
    }