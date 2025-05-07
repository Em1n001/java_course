package developia.az.bookauthor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/titles")
    public List<String> getAllTitles() {
        return bookRepository.findAllBookTitles();
    }
}
