package com.kai.demo2.collectionType;

import java.util.List;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/11/29
 **/
public class Book {
    private List<String> list;

    public void setList(List<String> list) {
        this.list = list;
    }

    public void test() {
        System.out.println(list);
    }

}
