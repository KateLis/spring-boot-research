package com.spring.boot.research.service;

import com.spring.boot.research.dao.BookDao;
import com.spring.boot.research.entity.Book;
import com.spring.boot.research.service.impl.BookServiceImpl;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class BookServiceTest {
    @Mock
    public BookDao bookDao;
    @InjectMocks
    private BookServiceImpl bookService;

    @Test
    public void testGetAll() {
        List<Book> expectedBooks = createBooks();
        when(bookDao.getAllBooks()).thenReturn(expectedBooks);

        List<Book> actual = bookService.getAllBooks();

        assertNotNull(actual);
        assertTrue(actual.size() == expectedBooks.size());
    }

    @Test
    public void testGetBookByTitle() {
        Book expectedBook = postBook();
        when(bookDao.getBookByTitle("Post test")).thenReturn(expectedBook);

        Book actualBook = bookService.getBookByTitle("Post test");
        Assert.assertEquals(expectedBook, actualBook);
    }

//    @Test
//    public void testPostBook(){
//
//    }
//    @Test
//    public void testDeleteBookById() {
//
//        bookService.deleteBook(2);
//    }

    private List<Book> createBooks() {
        Book book1 = new Book();
        book1.setTitle("Бег");
        book1.setCost(1200);
        Book book2 = new Book();
        book2.setTitle("Записки юного врача");
        book2.setCost(500);
        Book book3 = new Book();
        book3.setTitle("Мастер и Маргарита");
        book3.setCost(3500);
        return List.of(book1, book2, book3);
    }

    private Book postBook() {
        Book book1 = new Book();
        book1.setTitle("Post test");
        book1.setCost(7000);
        return book1;
    }
}
