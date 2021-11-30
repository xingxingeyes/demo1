package com.kai.demo4.aopanno;

import org.springframework.stereotype.Component;

/**
 * @description: 被增强的类
 * @author: kai.lv
 * @date: 2021/11/30
 **/
@Component
public class User {

    public void add() {
        // int a = 10/0;
        System.out.println("user.add()...");
    }
}
