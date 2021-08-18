package com.spring.boot.research.controller;

import com.spring.boot.research.entity.Book;
import com.spring.boot.research.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {

        this.bookService = bookService;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
    @GetMapping("/book/title/{title}")
    public Book getBookByTitle(@PathVariable(name="title") String title){
        return bookService.getBookByTitle(title);}

    @GetMapping("/book/id/{id}")
    public Book getBookById(@PathVariable(name="id") Long id){
        return bookService.getBookById(id);}
        
    @PostMapping("/books")
    public void postBook(@RequestBody Book book){
        bookService.postBook(book);
    }
    @PutMapping("/books")
    public void updateBookTitle(@RequestBody Book book){
        bookService.updateBookTitle(book);
    }

    @DeleteMapping("/books")
    public void deleteBook(@RequestParam(value="id") Long id){
        bookService.deleteBook(id);
    }
    
}
