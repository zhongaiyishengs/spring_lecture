package com.shengsiyuan.lifecycle.init_destory;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;


public class Car implements InitializingBean, DisposableBean {

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("car init....");
    }


    @Override
    public void destroy() throws Exception {
        System.out.println("car destroy....");
    }
}
