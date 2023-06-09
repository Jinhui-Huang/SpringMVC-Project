package com.itstudy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
* 创建springmvc的配置文件, 加载controller对应的bean
* */
@Configuration
@ComponentScan("com.itstudy.controller")
public class SpringMvcConfig {
}
