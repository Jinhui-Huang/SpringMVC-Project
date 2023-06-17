package com.itstudy.domain;

public class Book {
    private Integer BookId;
    private String BookType;
    private String BookName;
    private String BookDescription;

    public Book() {
    }

    public Book(Integer BookId, String BookType, String BookName, String BookDescription) {
        this.BookId = BookId;
        this.BookType = BookType;
        this.BookName = BookName;
        this.BookDescription = BookDescription;
    }

    /**
     * 获取
     * @return BookId
     */
    public Integer getBookId() {
        return BookId;
    }

    /**
     * 设置
     * @param BookId
     */
    public void setBookId(Integer BookId) {
        this.BookId = BookId;
    }

    /**
     * 获取
     * @return BookType
     */
    public String getBookType() {
        return BookType;
    }

    /**
     * 设置
     * @param BookType
     */
    public void setBookType(String BookType) {
        this.BookType = BookType;
    }

    /**
     * 获取
     * @return BookName
     */
    public String getBookName() {
        return BookName;
    }

    /**
     * 设置
     * @param BookName
     */
    public void setBookName(String BookName) {
        this.BookName = BookName;
    }

    /**
     * 获取
     * @return BookDescription
     */
    public String getBookDescription() {
        return BookDescription;
    }

    /**
     * 设置
     * @param BookDescription
     */
    public void setBookDescription(String BookDescription) {
        this.BookDescription = BookDescription;
    }

    public String toString() {
        return "Book{BookId = " + BookId + ", BookType = " + BookType + ", BookName = " + BookName + ", BookDescription = " + BookDescription + "}";
    }
}
