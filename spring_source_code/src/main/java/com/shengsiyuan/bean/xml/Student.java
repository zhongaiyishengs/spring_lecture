package com.shengsiyuan.bean.xml;

/**
 * @author zhonghaiqin
 * @version 1.0
 * @date 2020/6/17 8:34 下午
 */
public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }
}
