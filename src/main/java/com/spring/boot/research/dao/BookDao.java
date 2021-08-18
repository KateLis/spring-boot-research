package com.spring.boot.research.dao;

import com.spring.boot.research.entity.Book;

import java.util.List;

public interface BookDao {
    List<Book> getAllBooks();
    void postBook(Book book);
    void updateBookTitle(Book book);
    void deleteBook(Book id);
    Book getBookById(Long id);
    Book getBookByTitle(String title);
}
