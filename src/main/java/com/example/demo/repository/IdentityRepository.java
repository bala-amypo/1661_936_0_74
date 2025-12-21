package com.example.demo.repository;

import com.example.demo.entity.IdentityEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentityRepository extends JpaRepository<IdentityEntity, Integer> {
}
