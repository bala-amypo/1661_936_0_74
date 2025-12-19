package com.example.demo.repository;

import com.example.demo.entity.TimeStampEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeStampRepository extends JpaRepository<TimeStampEntity, Long> {
}
