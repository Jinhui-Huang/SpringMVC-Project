package com.itstudy.impl;

import com.itstudy.config.SpringConfig;
import com.itstudy.domain.Book;
import com.itstudy.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class BookServiceTest {

    @Autowired
    private BookService bookService;
    @Test
    public void testSelectByID() {
        Book book = bookService.selectBookById(1);
        System.out.println(book);
    }

    @Test
    public void testGetAll() {
        List<Book> allBooks = bookService.getAllBooks();
        System.out.println(allBooks);
    }

}
