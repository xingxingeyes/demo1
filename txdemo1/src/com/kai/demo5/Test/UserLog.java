package com.kai.demo5.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * @description:
 * @author: kai.lv
 * @date: 2021/12/1
 **/
public class UserLog {
    private static final Logger log = LoggerFactory.getLogger(UserLog.class);

    public static void main(String[] args) {
        // 表示手动控制台输出
        log.info("hello log4j2");
        log.warn("hello log4j2");
    }

}
