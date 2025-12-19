package com.example.demo.service.Impl;

import com.example.demo.entity.ValidationEntity;
import com.example.demo.repository.ValidationRepository;
import com.example.demo.service.ValidationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidationServiceImpl implements ValidationService {

    @Autowired
    private ValidationRepository validation;

    @Override
    public ValidationEntity postData(ValidationEntity val) {
        return validation.save(val);
    }

    @Override
    public ValidationEntity updateData(int id, ValidationEntity entity) {
        if (validation.existsById((long) id)) {
            entity.setId((long) id);
            return validation.save(entity);
        }

        return null;
    }
    @Override
       public ValidationEntity getData(int id){
         return validation.findById(id);
      } 
}
