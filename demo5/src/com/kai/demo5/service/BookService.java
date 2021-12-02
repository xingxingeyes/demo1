package com.kai.demo5.service;

import com.kai.demo5.dao.BookDao;
import com.kai.demo5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/12/1
 **/
@Service
public class BookService {

    // 注入dao
    @Autowired
    private BookDao bookDao;

    public void addBook(Book book) {
        bookDao.add(book);
    }

    /** 批量添加 */
    public void batchAddBook(List<Object[]> batchArgs) {
        bookDao.batchAddBook(batchArgs);
    }
    /** 批量修改 */
    public void batchUpdateBook(List<Object[]> batchArgs) {
        bookDao.batchUpdateBook(batchArgs);
    }
    /** 批量删除 */
    public void batchDeleteBook(List<Object[]> batchArgs) {
        bookDao.batchDeleteBook(batchArgs);
    }

    public void updateBook(Book book) {
        bookDao.updateBook(book);
    }

    public void deleteBook(String id) {
        bookDao.deleteBook(id);
    }

    public int findCount() {
        return bookDao.queryCount();
    }

    public Book findBook(String id) {
        return bookDao.queryBook(id);
    }

    public List<Book> findBookList() {
        return bookDao.queryBookList();
    }



}
