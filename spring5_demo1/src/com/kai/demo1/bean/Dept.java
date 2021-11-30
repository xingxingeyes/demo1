package com.kai.demo1.bean;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/11/29
 **/
public class Dept {
    private String dname;

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }
}
