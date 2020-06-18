package com.shengsiyuan.lifecycle.custom;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhonghaiqin
 * @version 1.0
 * @date 2020/6/17 8:22 下午
 */
@Configuration
public class MainConfigOfLifyCycle {
    @Bean(initMethod = "init",destroyMethod = "destory")
    public Ship ship(){
        return new Ship();
    }


}
