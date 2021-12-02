package com.kai.demo5.dao;

import com.kai.demo5.entity.Book;

import java.util.List;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/12/1
 **/
public interface BookDao {

    public void add(Book book);

    public void updateBook(Book book);

    public void deleteBook(String id);

    int queryCount();

    Book queryBook(String id);

    List<Book> queryBookList();

    void batchAddBook(List<Object[]> batchArgs);

    void batchUpdateBook(List<Object[]> batchArgs);

    void batchDeleteBook(List<Object[]> batchArgs);
}
