package com.shengsiyuan.bean.interface_FactoryBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 按照一定条件进行判断，满足条件就给容器中注册 bean
 */
@Configuration
public class MainConfig {

    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }
}
