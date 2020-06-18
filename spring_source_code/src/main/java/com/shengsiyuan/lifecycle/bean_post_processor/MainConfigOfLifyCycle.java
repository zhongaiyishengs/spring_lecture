package com.shengsiyuan.lifecycle.bean_post_processor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.shengsiyuan.lifecycle.post_construct")
@Configuration
public class MainConfigOfLifyCycle {

    @Bean
    public Dog dog(){
        return new Dog();
    }
}
