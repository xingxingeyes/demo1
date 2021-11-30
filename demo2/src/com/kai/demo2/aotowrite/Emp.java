package com.kai.demo2.aotowrite;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/11/30
 **/
public class Emp {

    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "dept=" + dept +
                '}';
    }

    public void test() {
        System.out.println(dept);
    }


}
