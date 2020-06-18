package com.shengsiyuan.bean.annotation_lazy;

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
    @Lazy
    @Scope("prototype")
    @Bean(name = "person")
    public Person getPerson(){
        System.out.println("给容器中添加 Person..");
        Person person=new Person();
        person.setId(1);
        person.setName("张三");
        return person;
    }
}
