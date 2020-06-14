package com.shengsiyuan.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author zhonghaiqin
 * @version 1.0
 * @date 2020/6/14 10:55 上午
 */
public class DynamicClient {
    public static void main(String[] args) {
        Subject subjectImpl=new SubjectImpl2();
        InvocationHandler invocationHandler=new DynamicSubject(subjectImpl);

        Class<?> classType=invocationHandler.getClass();

        Subject subject=(Subject) Proxy.newProxyInstance(classType.getClassLoader(),
                subjectImpl.getClass().getInterfaces(),invocationHandler);

        subject.myRequest();


    }
}
