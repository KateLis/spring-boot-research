package com.spring.boot.research.controller;

import com.spring.boot.research.entity.Book;
import com.spring.boot.research.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
    @PostMapping("/books")
    public void postBook(@RequestBody Book book){
        bookService.postBook(book);
    }


}
