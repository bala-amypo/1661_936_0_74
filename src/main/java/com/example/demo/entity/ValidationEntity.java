package com.example.demo.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Positive;
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
    @Size(min=6 ,max=8, message="must be 6 t0 8 characters")
    @NotNull(message="password is mandatory")
    private String password;
    @Max(30)
    @Positive(message="Age must be a positive number")
    private int age;

    public void setId(Integer id){
    this.id=id;
}
public Long getId(){
     return id;
}
public String getUsername(){
    return username;
}
public void setUsername(String username){
    this.username=username;
}
public String getEmail(String Email){
    return email;
}
public void setEmail(String email){
    this.email=email;
}

public String getPassword(){
    return password;
}
public void setPassword(String password){
    this.password=password;
}
public String getAge(){
    return age;
}
public void setAge(int age){
    this.age=age;
}
public ValidationEntity(Long id, 
@NotNull @Size(min =2,max=10,message="must be 2 to 10 character") String username,
@Email(message="Email is not valid")String email,
@Size(min=2,max=0,message="must be 2 to 10 character")@NotNull(message="password is mandatory")String Password,
@Max(30) @Positive(message="Age must be a positive number")int age){
    this.id=id;
    this.username=username;
    this.email=email;
    this.password=password;
    this.age=age;
}

}