package com.shengsiyuan.bean.annotation_import.interface_importSelector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 自定义逻辑 返回需要导入的组件
 */
public class MyImportSelector implements ImportSelector {
    /**
     *
     * @param importingClassMetadata 当前标注@Import注解类的 所有注解信息
     * @return
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.shengsiyuan.annotation_importSelector.Black",
                "com.shengsiyuan.annotation_importSelector.Blue"};
    }

}
