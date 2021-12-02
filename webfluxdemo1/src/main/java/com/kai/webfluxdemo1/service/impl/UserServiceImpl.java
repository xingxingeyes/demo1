package com.kai.webfluxdemo1.service.impl;

import com.kai.webfluxdemo1.entity.User;
import com.kai.webfluxdemo1.service.UserService;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/12/2
 **/
@Repository
public class UserServiceImpl implements UserService {
    // 创建map集合存储数据
    private final Map<Integer, User> users = new HashMap<>();

    public UserServiceImpl() {
        this.users.put(1, new User("lucy", "boy", 20));
        this.users.put(2, new User("mary", "boy", 21));
        this.users.put(3, new User("jack", "boy", 22));
    }

    @Override
    public Mono<User> getUserById(int id) {
        return Mono.justOrEmpty(users.get(1));
    }

    @Override
    public Flux<User> getAllUser() {
        return Flux.fromIterable(users.values());
    }

    @Override
    public Mono<Void> saveUserInfo(Mono<User> userMono) {
        return userMono.doOnNext(person -> {
            // 向集合里面放值
            int id = users.size() + 1;
            users.put(id, person);
        }).thenEmpty(Mono.empty());
    }
}
