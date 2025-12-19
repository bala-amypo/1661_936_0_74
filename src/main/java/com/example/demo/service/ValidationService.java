package com.example.demo.service;

import com.example.demo.entity.ValidationEntity;

public interface ValidationService {

    ValidationEntity postData(ValidationEntity entity);

    ValidationEntity updateData(int id, ValidationEntity entity);
}
