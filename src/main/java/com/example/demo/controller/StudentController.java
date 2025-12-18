package com.example.demo.controller;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;
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
    public String deleteValue(@PathVariable Integer id){
        return ser.DeleteData(id);
    }
    @GetMapping("/getid/{id}")
    public StudentEntity getdataid(@PathVariable Integer id){
        return ser.getData(id);
    }
    @PutMapping("/put/{id}")
    public StudentEntity putValue(@PathVariable int id,@RequestBody StudentEntity entity){
   return ser.updateData(id,entity);
}
}