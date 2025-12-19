
package com.example.demo.entity;
import jakarta.persistence.PreUpdate;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;
import jakarta.persistence.PrePersist;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TimeStampEntity{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Long id;
private String username;
private String email;
private LocalDateTime createAt;
private LocalDateTime updateAt;

@PrePersist   
    LocalDateTime now=LocalDateTime.now();                      
public void Oncreate(){

    this.createAt=now;
    this.updateAt=now;
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 
}
 @PreUpdate   
 public void Onupdate(){
 this.updateAt=now;
 
}
}