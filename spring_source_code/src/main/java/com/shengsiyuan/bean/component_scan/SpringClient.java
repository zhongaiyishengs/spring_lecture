package com.shengsiyuan.bean.component_scan;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhonghaiqin
 * @version 1.0
 * @date 2020/6/14 9:42 下午
 */
public class SpringClient {


    public void test(){

    }

    public static void main(String[] args) {

        AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(PersonConfiguration.class);
        String[] definitionNames=applicationContext.getBeanDefinitionNames();

        for(String definitionName:definitionNames){
            System.out.println(definitionName);
        }

    }
}
