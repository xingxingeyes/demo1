package com.kai.webfluxdemo1;

import com.kai.webfluxdemo1.entity.User;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/12/2
 **/
public class Client {

    public static void main(String[] args) {
        // 调用服务器地址
        WebClient webClient = WebClient.create("http://localhost:57804");

        // 根据id查询
        String id = "1";
        User userResault = webClient.get().uri("/users/{id}", id)
                .accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(User.class)
                .block();
        System.out.println(userResault);

        // 查询所有
        Flux<User> results = webClient.get().uri("/users")
                .accept(MediaType.APPLICATION_JSON).retrieve().bodyToFlux(User.class);

        results.map(stu -> stu.getName())
                .buffer().doOnNext(System.out::println).blockFirst();

    }


}
