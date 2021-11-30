package com.kai.demo2.collectionType;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/11/29
 **/
public class Stu {

    // 数组类型属性
    private String[] courses;
    // list集合类型属性
    private List<String> list;
    // map集合类型属性
    private Map<String,String> map;

    private Set<String> sets;

    private List<Course> courseList;

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", map=" + map +
                ", sets=" + sets +
                ", courseList=" + courseList +
                '}';
    }

    public void test() {
        System.out.println(Arrays.toString(courses) + "list:" + list + "map:" + map + "set:" + sets);
        System.out.println(toString());
    }

}
