package com.shengsiyuan.bean.annotation_import.interface_ImportBeanDefinitionRegistrar;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 自定义逻辑 返回需要导入的组件
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {

    /**
     * AnnotationMetadata : 当前类的注解信息
     * BeanDefinitionRegistry ：BeanDefinition 注册类， 
     * 把所有需要添加到容器中的bean : 调用 BeanDefinitionRegistry.registerBeanDefinitions注册
     * @param importingClassMetadata
     * @param registry
     */
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata,
                                        BeanDefinitionRegistry registry) {
      boolean redDefinition=registry.containsBeanDefinition("com.shengsiyuan.annotation_import.interface_ImportBeanDefinitionRegistrar.Red");
      boolean blueDefinition=registry.containsBeanDefinition("com.shengsiyuan.annotation_import.interface_ImportBeanDefinitionRegistrar.Blue");
      if (redDefinition && blueDefinition){
          RootBeanDefinition rootBeanDefinition=  new RootBeanDefinition(RainBow.class);
          registry.registerBeanDefinition("rainBow",rootBeanDefinition);

      }


        
    }
}
