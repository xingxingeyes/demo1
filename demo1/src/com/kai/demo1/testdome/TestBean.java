package com.kai.demo1.testdome;

import com.kai.demo1.bean.Emp;
import com.kai.demo1.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/11/29
 **/
public class TestBean {

    @Test
    public void testBean() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();

    }

    @Test
    public void testBean3() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();

    }
    @Test
    public void testBean4() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp = context.getBean("emp", Emp.class);
        emp.add();

    }


}
