package com.kai.demo3.dao;

import org.springframework.stereotype.Repository;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/11/30
 **/
@Repository(value = "UserDaoImpl1")// 根据就名称进行注入
public class UserDaoImpl implements UserDao{
    @Override
    public void add() {
        System.out.println("UserDaoImpl.add()...");
    }
}
