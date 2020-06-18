package com.shengsiyuan.bean.annotation_import.annotation_import;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * 按照一定条件进行判断，满足条件就给容器中注册 bean
 */
@Configuration
//@Import ：快速导入组件
@Import({Color.class,Red.class})
public class MainConfig {

    @Bean(name = "bill")
    public Person person01(){
        Person person=new Person();
        person.setId(1);
        person.setName("bill");
        return person;
    }
}
