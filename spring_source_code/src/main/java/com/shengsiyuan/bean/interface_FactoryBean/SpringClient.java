package com.shengsiyuan.bean.interface_FactoryBean;

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

        String[] beanNames=  applicationContext.getBeanDefinitionNames();
        Object obj=  applicationContext.getBean("colorFactoryBean");
        Object obj2=  applicationContext.getBean("colorFactoryBean");
        System.out.println(obj==obj2);
        System.out.println("beanType:"+obj.getClass());
        for(String beanName:beanNames){
            System.out.println(beanName);
        }
        //要获取工厂bean本身，我们需要给id前面 加 &
        Object factoryBean=  applicationContext.getBean("&colorFactoryBean");



    }
}
