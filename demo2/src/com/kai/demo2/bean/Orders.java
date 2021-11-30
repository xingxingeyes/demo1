package com.kai.demo2.bean;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/11/30
 **/
public class Orders {

    private String oname;

    public Orders() {
        System.out.println("第一步 执行无参构造创建bean实例");
    }

    public void setOname(String oname) {
        this.oname = oname;
        System.out.println("第二步 调动set方法设置属性值");
    }
    // 创建执行的初始化的方法
    public void initMethod() {
        System.out.println("第三步 执行初始化方法");
    }

    // 创建执行销毁的方法
    public void destoryMethod() {
        System.out.println("第五步 执行销毁方法");
    }


}
