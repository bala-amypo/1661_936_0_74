
package com.example.demo.service.Impl;

import com.example.demo.entity.StudentTableEntity;

import com.example.demo.repository.StudentTableRepository;
import com.example.demo.service.StudentTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentTableImpl implements StudentTableService {

    @Autowired
    private StudentTableRepository studenttable;

    @Override
    public StudentTableEntity postData(StudentTableEntity table) {
        return studenttable.save(table);
    }
}
