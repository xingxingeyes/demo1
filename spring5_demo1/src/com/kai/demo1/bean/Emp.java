package com.kai.demo1.bean;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/11/29
 **/
public class Emp {
    private String emane;
    private String gender;

    private Dept dept;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setEmane(String emane) {
        this.emane = emane;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void add() {
        System.out.println("ename:"+emane+" gender:"+gender+" dept:"+dept);
    }
}
