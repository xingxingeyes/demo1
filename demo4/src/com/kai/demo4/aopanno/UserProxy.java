package com.kai.demo4.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @description: 增强的类
 * @author: kai.lv
 * @date: 2021/11/30
 **/
@Component
@Aspect // 生成代理对象
@Order(3) // 多个增强类对同一个类的同一个方法增强 @Order注解可以设置优先级 数字越小优先级越高
public class UserProxy {

    // 相同切入点抽取
    @Pointcut(value = "execution(* com.kai.demo4.aopanno.User.add(..))")
    public void pointdemo() {

    }

    // @Before 注解前置通知
    // * 访问修饰符，空格返回值可以不写， 全类名，方法名，..代表参数
    @Before(value = "pointdemo()")
    public void before() {
        System.out.println("UserProxy brfore...");
    }

    // 最终通知 切点方法之后执行 不管有没有异常都会通知
    @After(value = "pointdemo()")
    public void after() {
        System.out.println("after...");
    }

    // 后置通知 切点方法返回值后执行，有异常不执行
    @AfterReturning(value = "pointdemo()")
    public void afterReturning() {
        System.out.println("afterReturning...");
    }

    // 异常通知
    @AfterThrowing(value = "pointdemo()")
    public void afterThrowing() {
        System.out.println("afterThrowing...");
    }

    // 环绕通知 方法之前和之后都执行 切点方法有异常后 环绕后不执行
    @Around(value = "pointdemo()")
    public void Around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        System.out.println("环绕之前...");
        // 被增强的方法执行
        proceedingJoinPoint.proceed();
        System.out.println("环绕之后...");
    }


}
