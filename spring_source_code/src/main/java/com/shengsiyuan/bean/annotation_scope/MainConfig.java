package com.shengsiyuan.bean.annotation_scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

/**
 * @author zhonghaiqin
 * @version 1.0
 * @date 2020/6/14 9:35 下午
 */
@Configuration
public class MainConfig {
    /**
     * prototype : 多实例的
     * singleton : 单实例的，ioc 容器启动会调用方法创建对象放到ioc容器中
     *             以后每次获取就是直接从容器（map.get() ）中拿
     * request : 同一次请求创建一个实例
     * session : 同一个session创建一个实例
     */
    @Lazy
    @Scope
    @Bean(name = "person")
    public Person getPerson(){
        System.out.println("给容器中添加 Person..");
        Person person=new Person();
        person.setId(1);
        person.setName("张三");
        return person;
    }
}
