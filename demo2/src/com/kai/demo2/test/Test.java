package com.kai.demo2.test;

import com.kai.demo2.aotowrite.Emp;
import com.kai.demo2.bean.Orders;
import com.kai.demo2.collectionType.Book;
import com.kai.demo2.collectionType.Course;
import com.kai.demo2.collectionType.Stu;
import com.kai.demo2.factorybean.MyBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/11/29
 **/
public class Test {

    @org.junit.Test
    public void testCollection() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu = context.getBean("stu", Stu.class);
        stu.test();

    }

    @org.junit.Test
    public void testCollection2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book1 = context.getBean("book", Book.class);
        Book book2 = context.getBean("book", Book.class);
        // book.test();
        // 两个实例地址相同，默认单实例
        System.out.println("book1:"+book1);
        System.out.println("book2:"+book2);

    }

    /**
     * xml定义的bean和返回的bean不同的方式
     */
    @org.junit.Test
    public void testCollection3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);

    }


    @org.junit.Test
    public void testCollection4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Orders orders = context.getBean("orders", Orders.class);
        System.out.println("第四步 获取创建bean实例对象");
        System.out.println(orders);
        
        // 手动让bean实例销毁
        ((ClassPathXmlApplicationContext)context).close();
    }

    @org.junit.Test
    public void testCollection5() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean5.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.test();
    }



}
