package com.shengsiyuan.bean.interface_FactoryBean;

import org.springframework.beans.factory.FactoryBean;

/**
 * 创建一个 Spring 定义的工厂Bean
 */
public class ColorFactoryBean implements FactoryBean<Color> {
    @Override
    public Color getObject(){
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    /**
     * true : 这个bean是单实例，在容器中保存一份
     * false : 多实例，每次获取都会创建一个
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
