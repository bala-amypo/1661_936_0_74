package com.example.demo.repository;
import org.springframework.stereotype.Repository;
@Repository

public interface StudetRepository extends JpaRepository<StudentEntity,Integer>{

}