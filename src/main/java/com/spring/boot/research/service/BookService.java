package com.spring.boot.research.service;

import com.spring.boot.research.entity.Book;

import java.util.List;

public interface BookService {
    List<Book> getAllBooks();
    void postBook(Book book);
}
