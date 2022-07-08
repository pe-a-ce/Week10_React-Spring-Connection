package com.example.reactbackendselfattempt.book;
import org.springframework.web.bind.annotation.*;
import java.util.Collection;


@RestController
@RequestMapping("/books")
@CrossOrigin(origins = "http://localhost:3000")
/*
annotation supports specific REST API, and not for the entire application.
annotation enables cross-origin resource sharing only for this specific method.
By default, its allows all origins, all headers, and the HTTP methods specified in the @RequestMapping annotation*/

public class BookController {
    private BookRepository bookRepository;
    public BookController(BookRepository bookRepository) { this.bookRepository = bookRepository;
    }
    @GetMapping
    Collection<Book> getAll() {
        return bookRepository.getAll();
    }
    @GetMapping("/{id}")
    Book get(@PathVariable Long id) {
        return bookRepository.get(id); }
    @PostMapping()
    void delete(@RequestBody Book book) {
        bookRepository.add(book); }
    @DeleteMapping("/{id}")
    void delete(@PathVariable Long id) {
        bookRepository.delete(id); }
}