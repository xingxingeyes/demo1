package com.kai.demo1.testdome;

import com.kai.demo1.User;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/11/27
 **/
public class TestUser {

    @Test
    public void add() {
        // 1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        // 2.获取配置创建的对象
        user.add();

    }

}
