package com.kai.demo1;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/11/29
 **/
public class Order {

    private String oname;
    public String address;

    public Order(String oname, String address) {
        this.oname = oname;
        this.address = address;
    }

    public void test() {
        System.out.println("ordre的属性：oname："+oname+"address:"+address);
    }


}
