package com.example.demo.repository;

import com.example.demo.entity.StudentTableEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentTableRepository extends JpaRepository<StudentTableEntity, Integer> {
}
