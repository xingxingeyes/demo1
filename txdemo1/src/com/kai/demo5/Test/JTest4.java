package com.kai.demo5.Test;

import com.kai.demo5.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description: Sping5框架的整合JUnit4
 * @author: kai.lv
 * @date: 2021/12/2
 **/
@RunWith(SpringJUnit4ClassRunner.class) // 单元测试框架
@ContextConfiguration("classpath:bean1.xml") // 加载配置文件
public class JTest4 {

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        userService.accountMoney();
    }

}
