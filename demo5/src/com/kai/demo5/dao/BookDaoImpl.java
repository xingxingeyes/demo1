package com.kai.demo5.dao;

import com.kai.demo5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/12/1
 **/
@Repository
public class BookDaoImpl implements BookDao{

    // 注入jdbcTemplate
    @Autowired
    private JdbcTemplate jdbcTemplate;


    @Override
    public void add(Book book) {
        String sql = "insert into t_book values(?,?,?)";
        // 调用方法实现
        Object[] args = { book.getUserId(), book.getUsername(), book.getUstatus()};
        int update = jdbcTemplate.update(sql,args);
        System.out.println(update);
    }

    @Override
    public void updateBook(Book book) {
        String sql = "update t_book set `username`=?,`ustatus`=? where `userId`=?";
        Object[] args = {book.getUsername(), book.getUstatus(), book.getUserId()};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Override
    public void deleteBook(String id) {
        String sql = "delete from t_book where `userId`=?";
        int update = jdbcTemplate.update(sql, id);
        System.out.println(update);
    }

    @Override
    public int queryCount() {
        String sql = "select count(*) from t_book";
        Integer integer = jdbcTemplate.queryForObject(sql,Integer.class);
        return integer;
    }

    @Override
    public Book queryBook(String id) {
        String sql = "select * from t_book where userId=?";
        Book book = jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<Book>(Book.class),id);
        return book;
    }

    @Override
    public List<Book> queryBookList() {
        String sql = "select * from t_book";
        List<Book> list = jdbcTemplate.query(sql,new BeanPropertyRowMapper<Book>(Book.class));
        return list;
    }

    @Override
    public void batchAddBook(List<Object[]> batchArgs) {
        String sql = "insert into t_book values(?,?,?)";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchUpdateBook(List<Object[]> batchArgs) {
        String sql = "update t_book set `username`=?,`ustatus`=? where `userId`=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }

    @Override
    public void batchDeleteBook(List<Object[]> batchArgs) {
        String sql = "delete from t_book where `userId`=?";
        int[] ints = jdbcTemplate.batchUpdate(sql, batchArgs);
        System.out.println(Arrays.toString(ints));
    }
}
