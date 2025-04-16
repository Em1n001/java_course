package developia.DTO.az;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentRestController {

    private final List<Student> students = new ArrayList<>();
    private Long nextId = 1L;

     @GetMapping
    public List<StudentDTO> getAllStudents() {
        List<StudentDTO> studentDTOs = new ArrayList<>();
        for (Student student : students) {
            studentDTOs.add(new StudentDTO(student.getName(), student.getAge()));
        }
        return studentDTOs;
    }

     @PostMapping("/add")
    public ResponseEntity<String> addStudent(@Valid @RequestBody StudentDTO studentDTO) {
        Student newStudent = new Student(nextId++, studentDTO.getName(), studentDTO.getAge());
        students.add(newStudent);
        return ResponseEntity.ok("Tələbə uğurla əlavə edildi!");
    }

     @GetMapping("/{id}")
    public ResponseEntity<StudentDTO> getStudentById(@PathVariable Long id) {
        Optional<Student> student = students.stream().filter(s -> s.getId().equals(id)).findFirst();
        
        return student.map(s -> ResponseEntity.ok(new StudentDTO(s.getName(), s.getAge())))
                      .orElseGet(() -> ResponseEntity.notFound().build());
    }
}
