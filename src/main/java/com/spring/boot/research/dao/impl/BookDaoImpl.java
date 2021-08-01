package com.spring.boot.research.dao.impl;

import com.spring.boot.research.dao.BookDao;
import com.spring.boot.research.entity.Book;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {

    private final SessionFactory sessionFactory;

    public BookDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public List<Book> getAllBooks() {
        return sessionFactory.getCurrentSession()
                .createQuery("SELECT c FROM Book c", Book.class).getResultList();
    }

    @Override
    public void postBook(Book book) {
        sessionFactory.getCurrentSession()
                .save(book);
    }
}
