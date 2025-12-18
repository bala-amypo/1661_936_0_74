package com.example.demo.service;
import com.example.demo.entity.ValidationEntity;
import java.util.List;
public interface ValidationService {
  
StudentEntity postData(ValidationEntity stu);
  List<StudentEntity>getAllData();
   String DeleteData(Integer id);           
StudentEntity getData(Integer id);
StudentEntity updateData(int id,StudentEntity entity);


}