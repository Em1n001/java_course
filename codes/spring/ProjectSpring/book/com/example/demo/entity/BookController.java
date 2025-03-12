package com.example.demo.entity;

import java.util.Arrays;
import java.util.List;

@Controller
public class BookController {
    @GetMapping("/books")
    public String getBooks(Model model) {
        List<Book> books = Arrays.asList(
            new Book("Java", "Alex", 30),
            new Book("Spring", "Fred", 40),
            new Book("Html", "Jude", 50)
        );
        model.addAttribute("books", books);
        return "book";
    }
}
