package com.example.demo.service.Impl;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.repository.ValidationRepository;
import com.example.demo.service.ValidationService;
// import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidationServiceImpl implements ValidationService {

    @Autowired ValidationRepository validation;
    
 

    // @Override
    // public ValidationEntity postData(ValidationEntity val) {
    //     return validation.save(val);
    }

    // @Override 
    //   public List<ValidationEntity>getAllData(){
    //       return validation.findAll();
    //   }
    //   @Override
    //   public String DeleteData(Long id){
    //     validation.deleteById(id);
    //     return "Deleted Successfully!";
    //   }
    //   @Override
    //    public ValidationEntity getData(Long id){
    //      return validation.findById(id).orElse(null);
    //   }                 
    //   @Override
    //   public ValidationEntity updateData(int id,ValidationEntity entity){
    //  if(validation.existsById(id)){
    //     entity.setId(id);
    //     return validation.save(entity);
    //  }
    //  return null;
     
    //   }
}
