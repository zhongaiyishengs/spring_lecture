package com.shengsiyuan.bean.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author zhonghaiqin
 * @version 1.0
 * @date 2020/6/14 10:50 上午
 */
public class DynamicSubject implements InvocationHandler {

    private Object subject;

    DynamicSubject(Object subject){
        this.subject=subject;
    }

    public void before(){
        System.out.println("before ..");
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before();
        method.invoke(subject,args);

        after();

        return null;
    }

    public void after(){
        System.out.println("after....");
    }
}
