package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.persistence.Id;
@Entity
public class ValidationEntity{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 2,max = 30, message="must be 2 to 10 character")
    private String username;
    @Email(message="Email is not valid")
    private String email;
    @Max(6)
    @Min(1)
    private String password;
    private int age;

}