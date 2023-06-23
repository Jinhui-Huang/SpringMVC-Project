package com.itstudy.config;

import com.itstudy.controller.Interceptor.ProjectInterceptor;
import com.itstudy.controller.Interceptor.ProjectInterceptor2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    @Autowired
    private ProjectInterceptor projectInterceptor;

    @Autowired
    private ProjectInterceptor2 projectInterceptor2;

    /**
     * 加载静态资源
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //registry.addResourceHandler("/resources/**").addResourceLocations("file:src\\main\\webapp\\resources\\");
        registry.addResourceHandler("/js/**").addResourceLocations("file:src\\main\\webapp\\js\\");
        registry.addResourceHandler("/css/**").addResourceLocations("file:src\\main\\webapp\\css\\");
        registry.addResourceHandler("/pages/**").addResourceLocations("file:src\\main\\webapp\\pages\\");
        registry.addResourceHandler("/plugins/**").addResourceLocations("file:src\\main\\webapp\\plugins\\");
    }

    /**
     * 设置拦截的路径
     * 先配置的拦截器先运行
     * */
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(projectInterceptor).addPathPatterns("/books","/books/*");
        registry.addInterceptor(projectInterceptor2).addPathPatterns("/books","/books/*");
    }
}
