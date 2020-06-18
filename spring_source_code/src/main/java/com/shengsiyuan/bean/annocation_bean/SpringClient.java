package com.shengsiyuan.bean.annocation_bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhonghaiqin
 * @version 1.0
 * @date 2020/6/14 9:42 下午
 */
public class SpringClient {


    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(PersonConfiguration.class);
        Person person=(Person)applicationContext.getBean("person");

        System.out.println(person.getId());

        AnnotationConfigApplicationContext annotationConfigApplicationContext=
                new AnnotationConfigApplicationContext();
/*

        annotationConfigApplicationContext.register(PersonConfiguration.class);
        annotationConfigApplicationContext.refresh();



        Person person=(Person)annotationConfigApplicationContext.getBean("person");
        System.out.println(person.getId());
*/

    }
}
