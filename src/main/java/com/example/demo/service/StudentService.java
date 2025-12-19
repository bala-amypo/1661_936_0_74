package com.example.demo.service;
import com.example.demo.entity.StudentEntity;
import java.util.List;
public interface StudentService {
  
StudentEntity postData(StudentEntity stu);
  List<StudentEntity>getAllData();
   String DeleteData(Integer id);           
StudentEntity getData(Integer id);
StudentEntity updateData(int id,StudentEntity entity);


}
