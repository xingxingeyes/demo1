package com.kai.demo3.service;

import com.kai.demo3.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/11/30
 **/
// @Component @Service @Controller @Repository 四个注解功能是一样的都可以用来创建bean实例
// 在注解里面value属性值可以省略不写
// 默认值是，首字母小写的类名称  userService
// @Component(value = "userService") // 和 <bean id="userService" class="..."/> 是等价的
// @Service
// @Controller
@Service
public class UserService {

    // 普通类型注入
    @Value(value = "abc")
    private String name;

    // 定义dao类型属性
    // 不需要添加set方法
    // 添加注入属性注解
    // @Autowired // 根据类型进行注入 单个实现类只用@Autowired 就可以了 有多个实现类的多就找不到是哪个了需要和@Qualifier 一同使用就可以找到了
    // @Qualifier(value = "UserDaoImpl1")// 根据名称进行注入 value可写可不写 需要和 @Autowired 一同使用
    // private UserDao userDao;


    @Resource // 根据类型进行注入
    // @Resource(name = "UserDaoImpl1") // 根据名称进行注入
    private UserDao userDao;

    public void add() {
        System.out.println("service add()..."+"name:"+name);
        userDao.add();
    }
}
