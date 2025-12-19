package com.example.demo.service.Impl;
import com.example.demo.exception.ValidationException;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.repository.ValidationRepository;
import com.example.demo.service.ValidationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidationServiceImpl implements ValidationService {

    @Autowired ValidationRepository validation;

    @Override
    public ValidationEntity postData(ValidationEntity val) {
        return validation.save(val);
    }

    @Override
       public ValidationEntity getData(long id){
         return validation.findById(id).orElseThrow(() -> new ValidationException("Invalid Id"+id));
      } 
}
