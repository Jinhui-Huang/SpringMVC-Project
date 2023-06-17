package com.itstudy.controller;


import com.itstudy.domain.Book;
import com.itstudy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping
    public Result save(@RequestBody Book book) {
        boolean saveFlag = bookService.saveBook(book);
        return new Result(saveFlag ? Code.SAVE_OK : Code.SAVE_ERR, saveFlag, saveFlag ? "图书添加成功" : "图书添加失败");
    }

    @GetMapping
    public Result getAll() {
        List<Book> allBooks = bookService.getAllBooks();
        Integer code = allBooks != null ? Code.GET_OK : Code.GET_ERR;
        String msg = allBooks != null ? "显示全部图书成功" : "数据查询失败请重试";
        return new Result(code, allBooks, msg);
    }

    @GetMapping("/{bookId}")
    public Result getBookById(@PathVariable Integer bookId) {
        //int i = 1/0; //开启异常测试
        Book book = bookService.selectBookById(bookId);
        Integer code = book != null ? Code.GET_OK : Code.GET_ERR;
        String msg = book != null ? "查询成功" : "数据查询失败请重试";
        return new Result(code, book, msg);
    }

    @PutMapping
    public Result updateBook(@RequestBody Book book) {
        boolean updateFlag = bookService.updateBook(book);
        return new Result(updateFlag ? Code.UPDATE_OK : Code.UPDATE_ERR, updateFlag, updateFlag ? "更新图书成功" : "更新图书失败");
    }

    @DeleteMapping("/{bookId}")
    public Result deleteBook(@PathVariable Integer bookId) {
        boolean deleteFlag = bookService.deleteBook(bookId);
        return new Result(deleteFlag ? Code.DELETE_OK : Code.DELETE_ERR,deleteFlag, deleteFlag ? "删除成功" : "删除失败");
    }

}
