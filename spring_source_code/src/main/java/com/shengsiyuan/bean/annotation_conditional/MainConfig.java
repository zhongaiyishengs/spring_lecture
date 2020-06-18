package com.shengsiyuan.bean.annotation_conditional;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 按照一定条件进行判断，满足条件就给容器中注册 bean
 */
@Configuration
public class MainConfig {
    /**
     * 如果系统是 windows ，给容器中注册（"bill"）
     * 如果系统是 Linux ，给容器中注册（"linux"）
     */
    @Conditional({WindowsCondition.class})
    @Bean(name = "bill")
    public Person person01(){
        System.out.println("给容器中添加 person01..");
        Person person=new Person();
        person.setId(1);
        person.setName("bill");
        return person;
    }

    @Conditional({LinuxCondition.class})
    @Bean(name = "linus")
    public Person person02(){
        System.out.println("给容器中添加 person02..");
        Person person=new Person();
        person.setId(2);
        person.setName("bill");
        return person;
    }
}
