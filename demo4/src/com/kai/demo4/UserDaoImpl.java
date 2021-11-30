package com.kai.demo4;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/11/30
 **/
public class UserDaoImpl implements UserDao{

    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了...");
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行了...");
        return id;
    }
}
