package com.shengsiyuan.annocation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhonghaiqin
 * @version 1.0
 * @date 2020/6/14 9:42 下午
 */
public class SpringClient {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext=
                new AnnotationConfigApplicationContext();

        annotationConfigApplicationContext.register(PersonConfiguration.class);
        annotationConfigApplicationContext.refresh();


        Person person=(Person)annotationConfigApplicationContext.getBean("person");
        System.out.println(person.getId());

/*

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
 */


    }
}
