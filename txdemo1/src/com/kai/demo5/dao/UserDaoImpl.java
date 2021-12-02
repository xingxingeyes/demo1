package com.kai.demo5.dao;

import com.kai.demo5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/12/1
 **/
@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /** lucy转账100给mary 加钱*/
    @Override
    public void addMoeny() {
        String sql = "update t_account set money=money+? where username=?";
        jdbcTemplate.update(sql, 100, "mary");
    }

    /** lucy转账100给mary 少钱*/
    @Override
    public void reduceMoeny() {
        String sql = "update t_account set money=money-? where username=?";
        jdbcTemplate.update(sql, 100, "lucy");
    }
}
