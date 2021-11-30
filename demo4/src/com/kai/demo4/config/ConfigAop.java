package com.kai.demo4.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @description: 完全注解开发 不需要创建xml文件
 * @author: kai.lv
 * @date: 2021/11/30
 **/
@Configuration
@ComponentScan(basePackages = {"com.kai.demo4"})
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class ConfigAop {
}
