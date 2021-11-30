package com.kai.demo1.service;

import com.kai.demo1.dao.UserDao;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/11/29
 **/
public class UserService {

    // 创建UserDao类型属性，生成set方法
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add() {
        System.out.println("userUervice add()....");
        userDao.update();
    }
}
