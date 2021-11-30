package com.kai.demo2.factorybean;

import com.kai.demo2.collectionType.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * @description:
 * @author: kai.lv
 * @date: 2021/11/30
 **/
public class MyBean implements FactoryBean<Course> {
    @Override
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setName("abc");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}
