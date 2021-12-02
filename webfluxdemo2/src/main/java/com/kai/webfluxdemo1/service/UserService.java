package com.kai.webfluxdemo1.service;

import com.kai.webfluxdemo1.entity.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @description: 基于函数式编程
 * @author: kai.lv
 * @date: 2021/12/2
 **/
public interface UserService {

    // 根据id查询用户
    Mono<User> getUserById(int id);

    // 查询所有用户
    Flux<User> getAllUser();
    // 添加用户
    Mono<Void> saveUserInfo(Mono<User> user);
}
