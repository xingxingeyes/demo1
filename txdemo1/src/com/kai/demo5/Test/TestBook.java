package com.kai.demo5.Test;

import com.kai.demo5.config.TxConfig;
import com.kai.demo5.entity.Book;
import com.kai.demo5.entity.User;
import com.kai.demo5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.ArrayList;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/12/1
 **/
public class TestBook {

    @Test
    public void testAccount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    @Test
    public void testAccount2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    /**
     * 完全注解声明试事务管理
     */
    @Test
    public void testAccount3() {
        ApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.accountMoney();
    }

    /**
     *     * 函数式风格创建对象，交给spring进行管理
     *     （不用注解，也不用配置xml,自己new的对象，自己new的对象，交给spring进行管理）
     */
    @Test
    public void testGenericApplicationContext() {
        // 1.创建GenericApplicationContext对象
        GenericApplicationContext context = new GenericApplicationContext();
        // 2.调用context的方法对象注册
        context.refresh();// 清空
        // context.registerBean( User.class,() -> new User());// 通过lamdar表达式 注册对象
        context.registerBean("user1", User.class,() -> new User());// 通过lamdar表达式 注册对象
        // 3.获取在spring注册的对象
        // User user = (User) context.getBean("com.kai.demo5.entity.User");
        User user = (User) context.getBean("user1");
        System.out.println(user);
    }

}
