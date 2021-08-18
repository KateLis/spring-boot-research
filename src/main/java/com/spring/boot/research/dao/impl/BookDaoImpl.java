package com.spring.boot.research.dao.impl;

import com.spring.boot.research.dao.BookDao;
import com.spring.boot.research.entity.Book;
import org.hibernate.SessionFactory;
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

    @Override
    public void updateBookTitle(Book book) {
       // book.setTitle(title);
        sessionFactory.getCurrentSession().update(book);
    }

    @Override
    public void deleteBook(Book book) {
        sessionFactory.getCurrentSession().delete(book);
    }

    public Book getBookById(Long id){
        return sessionFactory.getCurrentSession().get(Book.class, id);
    }

    @Override
    public Book getBookByTitle(String title) {
        return sessionFactory.getCurrentSession().createQuery("SELECT b.id, b.title, b.cost FROM Book b WHERE b.title = 'Klara'", Book.class).getSingleResult();
}

}
