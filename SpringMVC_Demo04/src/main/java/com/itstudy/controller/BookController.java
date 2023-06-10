package com.itstudy.controller;


import com.itstudy.domain.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @PostMapping
    public String save(@RequestBody Book book) {
        System.out.println("book save ==> " + book);
        return "{'module':'book save success'}";
    }

    @GetMapping
    public List<Book> getAll() {
        System.out.println("book controller is running");
        Book book1 = new Book();
        book1.setType("计算机");
        book1.setName("SpringMVC入门");
        book1.setDescription("web层开发");

        Book book2 = new Book();
        book2.setType("计算机");
        book2.setName("SpringMVC实战");
        book2.setDescription("web层开发");

        Book book3 = new Book();
        book3.setType("计算机");
        book3.setName("SpringMVC进阶");
        book3.setDescription("web层开发");

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);

        return bookList;
    }

}
