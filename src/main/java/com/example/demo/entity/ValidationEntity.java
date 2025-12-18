package com.example.demo.Entity;
import jakarta.persistence.Entity;

@Entity
public class ValidationEntity{
    
    private Long id;
    @NotNull
    private String username;
    private String email;
    private String password;
    private int age;

}