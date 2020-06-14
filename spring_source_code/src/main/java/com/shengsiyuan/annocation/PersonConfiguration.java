package com.shengsiyuan.annocation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhonghaiqin
 * @version 1.0
 * @date 2020/6/14 9:35 下午
 */
@Configuration
public class PersonConfiguration {

    @Bean(name = "person")
    public Person getPerson(){
        Person person=new Person();
        person.setId(1);
        person.setName("张三");
        return person;
    }
}
