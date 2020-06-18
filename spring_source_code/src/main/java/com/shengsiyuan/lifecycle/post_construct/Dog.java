package com.shengsiyuan.lifecycle.post_construct;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 */
@Component
public class Dog {

    public Dog(){
        System.out.println("dog construt");
    }

    /**
     * 对象创建并赋值之后调用
     */
    @PostConstruct
    public void init(){
        System.out.println("dog @PostConstruct");
    }
    /**
     * 对象创建并赋值之后调用
     */
    @PreDestroy
    public void destory(){
        System.out.println("dog @PreDestroy");
    }

}
