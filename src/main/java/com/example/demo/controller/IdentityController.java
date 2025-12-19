package com.example.demo.controller;
import com.example.demo.service.IdentityService;
import com.example.demo.entity.IdentityEntity;
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
public class IdentityController{
@Autowired IdentityService itable;
  
    @PostMapping("/postforIdentityTable")
    public IdentityEntity sendData(@RequestBody IdentityEntity Entit){
        return itable.postData(Entit);
    }
    }