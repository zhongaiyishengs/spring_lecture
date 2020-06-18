package com.shengsiyuan.lifecycle.custom;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class IOCTest {

    public static void main(String[] args) {
        //创建IOC 容器
        AnnotationConfigApplicationContext applicationContext=
                new AnnotationConfigApplicationContext(MainConfigOfLifyCycle.class);

        // 容器关闭的时候 会调用销毁容器方法
        applicationContext.close();
    }
}
