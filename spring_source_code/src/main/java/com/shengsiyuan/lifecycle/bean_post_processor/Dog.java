package com.shengsiyuan.lifecycle.bean_post_processor;

import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 *
 */
@Component
public class Dog implements BeanPostProcessor {

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
