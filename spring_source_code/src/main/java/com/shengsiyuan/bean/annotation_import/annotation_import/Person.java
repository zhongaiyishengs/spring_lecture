package com.shengsiyuan.bean.annotation_import.annotation_import;

/**
 * @author zhonghaiqin
 * @version 1.0
 * @date 2020/6/14 9:33 下午
 */
public class Person {
    private  int id;
    private String name;

    public int getId() {
        return id;
    }

    public Person setId(int id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }
}
