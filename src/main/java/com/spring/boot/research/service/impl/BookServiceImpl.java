package com.spring.boot.research.service.impl;

import com.spring.boot.research.dao.BookDao;
import com.spring.boot.research.entity.Book;
import com.spring.boot.research.service.BookService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    public final BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    @Transactional
    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    @Override
    @Transactional
    public void postBook(Book book) {
        bookDao.postBook(book);
    }


    @Override
    @Transactional
    public void updateBookTitle(Book book) {
        bookDao.updateBookTitle(book);
    }

    @Override
    @Transactional
    public Book getBookByTitle(String title) {
        return bookDao.getBookByTitle(title);
    }

    @Transactional
    public Book getBookById(Long id) {
        return bookDao.getBookById(id);
    }

    @Override
    @Transactional
    public void deleteBook(Long id) {
        Book book = bookDao.getBookById(id);
        bookDao.deleteBook(book);
    }


}
