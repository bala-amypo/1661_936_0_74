package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positve;
import jakarta.validation.constraints.Max;
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
    @Siz
    @NotNull(message="password is mandatory")
    private String password;
    @Max(30)
    @Positve(message="Age must be a positive number")
    private int age;

}