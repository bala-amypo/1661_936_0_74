package com.example.demo.entity;
import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class ValidationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(min = 2, max = 30, message = "must be 2 to 30 characters")
    private String username;

    @Email(message = "Email is not valid")
    private String email;

    @NotNull(message = "password is mandatory")
    @Size(min = 6, max = 8, message = "must be 6 to 8 characters")
    private String password;

    @Positive(message = "Age must be positive")
    @Max(30)
    private int age;

   
}
