package com.itstudy.service.impl;

import com.itstudy.controller.Code;
import com.itstudy.dao.BookDao;
import com.itstudy.domain.Book;
import com.itstudy.exception.BusinessException;
import com.itstudy.exception.SystemException;
import com.itstudy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public List<Book> getAllBooks() {
        try {
            return bookDao.getAllBooks();
        } catch (Exception e) {
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR, "服务器超时, 请重试!", e);
        }
    }

    @Override
    public Book selectBookById(Integer bookId) {
        if (bookId < 0) {
            throw new BusinessException(Code.BUSINESS_ERR, "请勿进行非法操作!");
        }
        try {
            //int i = 1/0; //开启异常测试
            return bookDao.selectById(bookId);
        } catch (Exception e) {
            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR, "服务器超时, 请重试!", e);
        }
    }

    @Override
    public boolean deleteBook(Integer bookId) {
        return bookDao.delete(bookId) > 0;
    }

    @Override
    public boolean saveBook(Book book) {
        //大于0返回true表示保存成功
        return bookDao.save(book) > 0;
    }

    @Override
    public boolean updateBook(Book book) {
        return bookDao.update(book) > 0;
    }
}
