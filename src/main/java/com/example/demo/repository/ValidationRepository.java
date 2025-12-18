package com.example.demo.repository;

import com.example.demo.entity.ValidationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValidationRepository
        extends JpaRepository<ValidationEntity, Long> {
}
