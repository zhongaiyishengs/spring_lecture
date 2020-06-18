package com.shengsiyuan.lifecycle.post_construct;

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
