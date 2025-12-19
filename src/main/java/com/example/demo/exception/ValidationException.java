package com.example.demo.exception;
import com.example.demo.entity.ValidationEntity;
public class ValidationException extends RuntimeException{



public ValidationException(String message){
super(message);
@Override
       public ValidationEntity getData(long id){
                return validation.findById(id);
                      
                            } 
                            }
                            } 