package com.spring.boot.research.dao;

import com.spring.boot.research.entity.Book;

import java.util.List;

public interface BookDao {
    List<Book> getAllBooks();
    void postBook(Book book);
}
