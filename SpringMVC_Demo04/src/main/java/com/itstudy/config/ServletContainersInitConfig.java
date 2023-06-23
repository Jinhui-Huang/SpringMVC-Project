package com.itstudy.config;

import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.Filter;
import javax.swing.*;

/**
 * 定义一个servlet容器启动的配置类, 在里面加载spring的配置
 * 需要继承一个抽象类AbstractDispatcherServletInitializer
 */
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * 加载Spring容器配置
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    /**
     * 加载springMVC容器配置
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    /**
     * 设置哪些请求归属springMVC处理
     * "/"所有请求归springMVC处理
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    /**
     * 中文乱码处理
     */
    @Override
    protected Filter[] getServletFilters() {
        CharacterEncodingFilter filter = new CharacterEncodingFilter();
        //设置字符集
        filter.setEncoding("UTF-8");
        return new Filter[]{filter};
    }


}
