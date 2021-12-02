package com.kai.demo5.Test;

import com.kai.demo5.service.UserService;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @description: Sping5框架的整合JUnit5
 * @author: kai.lv
 * @date: 2021/12/2
 **/
// @ExtendWith(SpringExtension.class)
// @ContextConfiguration("classpath:bean1.xml")
@SpringJUnitConfig(locations = "classpath:bean1.xml") // 使用一个复合注解，可以代替上面两个注解完成整合
public class JTest5 {

    @Autowired
    private UserService userService;

    @Test
    public void test() {
        userService.accountMoney();
    }

}
