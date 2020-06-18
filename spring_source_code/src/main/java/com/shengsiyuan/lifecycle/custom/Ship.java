package com.shengsiyuan.lifecycle.custom;

/**
 * @author zhonghaiqin
 * @version 1.0
 * @date 2020/6/17 8:21 下午
 */
public class Ship {

    public Ship(){
        System.out.println("ship constructor....");
    }

    public void init(){
        System.out.println("ship init....");
    }

    public void destory(){
        System.out.println("ship destory...");
    }
}
