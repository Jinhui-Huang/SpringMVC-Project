package com.itstudy.dao;

import com.itstudy.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BookDao {
    @Results(value = {
            @Result(column = "book_id", property = "bookId"),
            @Result(column = "book_type", property = "bookType"),
            @Result(column = "book_name", property = "bookName"),
            @Result(column = "book_description", property = "bookDescription")
    })
    @Select("select * from books")
    List<Book> getAllBooks();

    @Results(value = {
            @Result(column = "book_id", property = "bookId"),
            @Result(column = "book_type", property = "bookType"),
            @Result(column = "book_name", property = "bookName"),
            @Result(column = "book_description", property = "bookDescription")
    })
    @Select("select * from books where book_id = #{bookId}")
    Book selectById(Integer bookId);

    @Delete("delete from books where book_id = #{bookId}")
    int delete(Integer bookId);

    @Insert("insert into books (book_type, book_name, book_description) VALUES (#{bookType}, #{bookName}, #{bookDescription})")
    int save(Book book);

    @Update("update books set book_type = #{bookType}, book_name = #{bookName}, book_description = #{bookDescription} " +
            "where book_id = #{bookId}")
    int update(Book book);
}
