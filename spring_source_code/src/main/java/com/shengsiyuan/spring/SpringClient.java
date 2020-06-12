package com.shengsiyuan.spring;

import com.shengsiyuan.bean.Student;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * IOC （Inverse of Control） 控制反转
 * DI (Dependency Injection) 依赖注入
 */
public class SpringClient {

    public static void main(String[] args) {
        //定义资源
        Resource resource=new ClassPathResource("applicationContext.xml");
        System.out.println("resource="+resource.getFilename());

        //定义工厂
        DefaultListableBeanFactory defaultListableBeanFactory=new DefaultListableBeanFactory();

        //指定相应的 Bean读取器
        BeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(defaultListableBeanFactory);

        //从指定的 文件中读取，读取完后，把所有的bean 都放入到bean工厂中去
        beanDefinitionReader.loadBeanDefinitions(resource);

        //从工厂 中获取 bean
        Student student=(Student) defaultListableBeanFactory.getBean("student");
        System.out.println(student.toString());
    }
}
