package com.kai.demo4.aopanno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/11/30
 **/
@Component
@Aspect
@Order(1) // 多个增强类对同一个类的同一个方法增强 @Order注解可以设置优先级 数字越小优先级越高
public class PersonProxy {

    // @Before 注解前置通知
    // * 访问修饰符，空格返回值可以不写， 全类名，方法名，..代表参数
    @Before(value = "execution(* com.kai.demo4.aopanno.User.add(..))")
    public void before() {
        System.out.println("PersonProxy brfore...");
    }
}
