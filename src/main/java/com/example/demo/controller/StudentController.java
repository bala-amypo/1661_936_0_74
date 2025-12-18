package com.example.demo.controller;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
public class StudentController{
@Autowired StudentService ser;
  
    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody StudentEntity ent){
        return ser.postData(ent);
    }
    @GetMapping("/get")
    public List<StudentEntity> getValue(){
        return ser.getAllData();
    }
    @DeleteMapping("/delete/{id}")
    public String deleteValue()(@PathVariable int id){
        return ser.DeleteData(id);
    }
}