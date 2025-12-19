
package com.example.demo.service.Impl;

import com.example.demo.entity.IdentityEntity;

import com.example.demo.repository.IdentityRepository;
import com.example.demo.service.IdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdentityImpl implements IdentityService {

    @Autowired
    private IdentityRepository identitytable;

    @Override
    public IdentityEntity postData(IdentityEntity tablei) {
        return identitytable.save(tablei);
    }
}
