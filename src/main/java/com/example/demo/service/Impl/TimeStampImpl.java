package com.example.demo.service.Impl;
import com.example.demo.exception.TimeStampException;
import com.example.demo.entity.TimeStampEntity;
import com.example.demo.repository.TimeStampRepository;
import com.example.demo.service.
;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeStampImpl implements ValidationService {

    @Autowired TimeStampRepository timestamp;

    @Override
    public TimeStampEntity postData(TimeStampEntity time) {
        return timestamp.save(time);
    }
        
}
package com.example.demo.service.Impl;

import com.example.demo.entity.TimeStampEntity;
import com.example.demo.exception.TimeStampException;
import com.example.demo.repository.TimeStampRepository;
import com.example.demo.service.TimeStampService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TimeStampServiceImpl implements TimeStampService {

    @Autowired
    private TimeStampRepository timestamp;

    @Override
    public TimeStampEntity postData(TimeStampEntity time) {
        return timestamp.save(time);
    }
}
