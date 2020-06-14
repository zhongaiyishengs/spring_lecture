package com.shengsiyuan.proxy;

/**
 * @author zhonghaiqin
 * @version 1.0
 * @date 2020/6/14 10:49 上午
 */
public class SubjectImpl2 implements Subject{

    @Override
    public void myRequest() {
        System.out.println("myRequestImpl2..");
    }
}
