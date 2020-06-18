package com.shengsiyuan.bean.component_scan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 *  配置类==配置文件
 *  @Configuration ：告诉Spring这是一个配置
 */
@Configuration
@ComponentScan(value = "com.shengsiyuan",excludeFilters =
        {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})})
public class PersonConfiguration {
    /**
     * 给容器注册一个bean；类型为返回值的类型，id默认是方法名做完ID
     * 如果不取名字，beanName 默认是方法名 ,等同于 xml配置中的 <bean id="person" />
     */
    @Bean(name = "person")
    public Person getPerson(){
        Person person=new Person();
        person.setId(1);
        person.setName("张三");
        return person;
    }
}
