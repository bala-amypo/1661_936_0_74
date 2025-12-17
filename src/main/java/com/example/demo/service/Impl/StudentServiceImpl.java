package com.example.demo.service.Impl;
import org.springframework.bens.factory.annotation.AutoWired;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.entity.StudentEntity;


@Service
public class StudentServiceImpl implements StudentService{
    @Autowired StudetRepository student;
    //save()
    //findall()
    //findById()
    //deleteById();
    //existById();
    @Override
 public StudentEntity postData(StudentEntity stu){
  return student.save(stu);

 }
}