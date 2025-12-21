package com.example.demo.controller;
import com.example.demo.service.TimeStampService;
import com.example.demo.entity.TimeStampEntity;
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
public class TimeStampController{
@Autowired TimeStampService stamp;
  
    @PostMapping("/postforTimeStamp")
    public TimeStampEntity sendData(@RequestBody TimeStampEntity Ent){
        return stamp.postData(Ent);
    }
    }