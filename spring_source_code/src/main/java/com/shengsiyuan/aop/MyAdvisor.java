package com.shengsiyuan.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author zhonghaiqin
 * @version 1.0
 * @date 2020/6/14 12:57 下午
 */
public class MyAdvisor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {

        System.out.println("before...");
        Object result=  invocation.proceed();
        System.out.println("after...");
        return null;
    }
}
