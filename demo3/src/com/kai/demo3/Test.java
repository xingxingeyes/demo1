package com.kai.demo3;

import com.kai.demo3.config.SpringConfig;
import com.kai.demo3.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/11/30
 **/
public class Test {

    @org.junit.Test
    public void testService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();

    }

    @org.junit.Test
    public void testService2() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserService userService = context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();

    }

}
