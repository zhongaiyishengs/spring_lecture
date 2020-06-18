package com.shengsiyuan.lifecycle.init_destory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.shengsiyuan.lifecycle")
@Configuration
public class MainConfigOfLifyCycle {

    @Bean
    public Car car(){
        return new Car();
    }
}
