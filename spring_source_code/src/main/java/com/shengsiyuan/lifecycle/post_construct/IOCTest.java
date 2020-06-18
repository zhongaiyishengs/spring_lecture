package com.shengsiyuan.lifecycle.post_construct;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhonghaiqin
 * @version 1.0
 * @date 2020/6/17 8:23 下午
 */
public class IOCTest {

    public static void main(String[] args) {
        //创建IOC 容器
        AnnotationConfigApplicationContext applicationContext=
                new AnnotationConfigApplicationContext(MainConfigOfLifyCycle.class);

        // 容器关闭的时候 会调用销毁容器方法
        applicationContext.close();
    }
}
