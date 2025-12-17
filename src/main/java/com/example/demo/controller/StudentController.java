package.com.example.demo.controller;
import com.example.demo.entity.StudentEntity;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
@Service
@Override
public class StudentController{
    @AutoWired StudentService ser;


}