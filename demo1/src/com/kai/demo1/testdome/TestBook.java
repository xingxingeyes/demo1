package com.kai.demo1.testdome;

import com.kai.demo1.Book;
import com.kai.demo1.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/11/27
 **/
public class TestBook {

    @Test
    public void add() {
        // 1.加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        // 2.获取配置创建的对象
        book.testDemo();

    }

}
