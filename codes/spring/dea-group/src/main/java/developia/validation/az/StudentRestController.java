package developia.validation.az;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentRestController {

    private List<Student> students = new ArrayList<>();

    @PostMapping("/add")
    public ResponseEntity<String> addStudent(@Valid @RequestBody Student student) {
        students.add(student);
        return ResponseEntity.ok("Telebe uğurla elavə edildi");
    }
}
