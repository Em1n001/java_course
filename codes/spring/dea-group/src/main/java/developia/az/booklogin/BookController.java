package developia.az.booklogin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

     @PostMapping
    public Book addBook(@RequestBody Book book) {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        book.setUsername(username);  
        return bookRepository.save(book);
    }

     @GetMapping
    public List<Book> getUserBooks() {
        String username = SecurityContextHolder.getContext().getAuthentication().getName();
        return bookRepository.findByUsername(username);
    }
}
