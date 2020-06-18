package com.shengsiyuan.bean.annotation_conditional;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhonghaiqin
 * @version 1.0
 * @date 2020/6/14 9:42 下午
 */
public class SpringClient {


    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(MainConfig.class);

        String[] beanNames=  applicationContext.getBeanNamesForType(Person.class);

        for(String beanName:beanNames){
            System.out.println(beanName);
        }



    }
}
