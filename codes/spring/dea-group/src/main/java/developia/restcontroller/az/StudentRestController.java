package developia.restcontroller.az;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentRestController {

    private final List<Student> students = new ArrayList<>();

    public StudentRestController() {
        students.add(new Student(1, "Emin", 20));
        students.add(new Student(2, "Ali", 22));
        students.add(new Student(3, "Omer", 21));
    }

    @GetMapping
    public List<Student> getAllStudents() {
        return students;
    }

     @PostMapping("/add")
    public String addStudent(@RequestBody Student student) {
        students.add(student);
        return "Tələbə uğurla əlavə edildi!";
    }
}

