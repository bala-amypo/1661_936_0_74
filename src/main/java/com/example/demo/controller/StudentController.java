0package.com.example.demo.controller;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.sprigframework.web.bind.annotation.RestController;
@RestController
public class StudentController{
    @AutoWired StudentService ser;


}