package com.shengsiyuan.bean.component_scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @author zhonghaiqin
 * @version 1.0
 * @date 2020/6/17 10:00 上午
 */
@Configuration
@ComponentScan(value = "com.shengsiyuan",excludeFilters =
        {@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class})})
public class MainConfig {
}
