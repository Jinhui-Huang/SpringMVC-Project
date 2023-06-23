package com.itstudy.service;

import com.itstudy.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/*
* 业务层操作名见名知意
* 无返回值得方法要返回boolean值, 判断是否成功执行
* 方法名上方需要写上文档注释
* */
@Transactional
public interface BookService {

    /**
     * 查询全部书本信息
     * */
    List<Book> getAllBooks();

    /**
     * 查询单本图书信息
     * */
    Book selectBookById(Integer bookId);

    /**
     * 根据bookId删除图书信息
     * */
    boolean deleteBook(Integer bookId);

    /**
     * 保存单本图书
     * */
    boolean saveBook(Book book);

    /**
     * 更新图书信息
     * */
    boolean updateBook(Book book);
}
