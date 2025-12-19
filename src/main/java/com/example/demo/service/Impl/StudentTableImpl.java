
package com.example.demo.service.Impl;

import com.example.demo.entity.StudentTableEntity;
import com.example.demo.exception.StudentTableException;
import com.example.demo.repository.StudentTableRepository;
import com.example.demo.service.StudentTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeStampImpl implements StudentTableService {

    @Autowired
    private StudentTableRepository timestamp;

    @Override
    public StudentTableEntity postData(StudentTableEntity time) {
        return timestamp.save(time);
    }
}
