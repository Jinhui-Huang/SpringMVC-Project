package com.itstudy.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

import javax.swing.*;

/*
* 定义一个servlet容器启动的配置类, 在里面加载spring的配置
* 需要继承一个抽象类AbstractDispatcherServletInitializer
* */
public class ServletContainersInitConfig extends AbstractAnnotationConfigDispatcherServletInitializer {

    /*
     * 加载Spring容器配置
     * */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{SpringConfig.class};
    }

    /*
     * 加载springMVC容器配置
     * */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{SpringMvcConfig.class};
    }

    /*
     * 设置哪些请求归属springMVC处理
     * "/"所有请求归springMVC处理
     * */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }





    /*    *//*
    * 加载springMVC容器配置
    * *//*
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        //注册你的springMVC配置
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    *//*
     * 加载Spring容器配置
     * *//*
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringConfig.class);
        return ctx;
    }

    *//*
    * 设置哪些请求归属springMVC处理
    * "/"所有请求归springMVC处理
    * *//*
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }*/


}
