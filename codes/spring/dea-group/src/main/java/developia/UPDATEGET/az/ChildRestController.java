package developia.UPDATEGET.az;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import developia.restcontroller.az.Student;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
@Validated
public class ChildRestController {

    private final List<Student> students = new ArrayList<>();

     @GetMapping
    public List<Student> getAllStudents() {
        return students;
    }

     @GetMapping("/{id}")
    public ResponseEntity<Student> getStudentById(@PathVariable Long id) {
        Optional<Student> student = students.stream()
                .filter(s -> s.getId())
                .findFirst();
        
        return student.map(ResponseEntity::ok)
                      .orElseGet(() -> ResponseEntity.notFound().build());
    }

     @PostMapping("/add")
    public ResponseEntity<String> addStudent(@Valid @RequestBody Student student) {
        students.add(student);
        return ResponseEntity.ok("Tələbə uğurla əlavə edildi!");
    }

     @PutMapping("/{id}")
    public ResponseEntity<String> updateStudent(@PathVariable Long id, @Valid @RequestBody Student updatedStudent) {
        for (Student student : students) {
            if (student.getId()) {
                student.setName(updatedStudent.getName());
                student.setAge(updatedStudent.getAge());
                return ResponseEntity.ok("Tələbə uğurla yeniləndi!");
            }
        }
        return ResponseEntity.notFound().build();
    }
}
