package developia.az.Swagger;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bookapp.model.Book;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Operation(summary = "Bütün kitabları gətir", description = "Verilənlər bazasındakı bütün kitab siyahısını qaytarır.")
    @GetMapping
    public List<Book> getAllBooks() {
        return List.of(new Book(), new Book());
    }

    @Operation(summary = "Yeni kitab əlavə et")
    @PostMapping
    public Book addBook(@RequestBody Book book) {
        return book;
    }
}
