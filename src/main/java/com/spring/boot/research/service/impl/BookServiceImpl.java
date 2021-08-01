package com.spring.boot.research.service.impl;

import com.spring.boot.research.dao.BookDao;
import com.spring.boot.research.entity.Book;
import com.spring.boot.research.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    public final BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    @Override
    public void postBook(Book book) {
        bookDao.postBook(book);
    }
}
