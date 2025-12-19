package com.example.demo.entity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class IdentityEntity{
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer id;
private String IdCard;
@OneToOne
@JoinColumn(name="C")
private IdentityEntity idcard;

}


