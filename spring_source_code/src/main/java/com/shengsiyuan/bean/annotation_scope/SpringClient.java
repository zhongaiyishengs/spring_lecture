package com.shengsiyuan.bean.annotation_scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhonghaiqin
 * @version 1.0
 * @date 2020/6/14 9:42 下午
 */
public class SpringClient {


    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("IOC 容器创建完成");
/*
        Person person=(Person)applicationContext.getBean("person");

        Person person2=(Person)applicationContext.getBean("person");
        System.out.println(person==person2);*/




    }
}
