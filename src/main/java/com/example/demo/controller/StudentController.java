package.com.example.demo.controller;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.postMapping;
@RestController
public class StudentController{
    @AutoWired StudentService ser;
  
    @PostMapping("/post")
    public StudentEntity sendData(@RequestBody stu){
        
    }

}