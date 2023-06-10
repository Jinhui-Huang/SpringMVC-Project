package com.itstudy.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class SpringMvcSupport extends WebMvcConfigurationSupport {
    /*
     * 加载静态资源
     * */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //registry.addResourceHandler("/resources/**").addResourceLocations("file:src\\main\\webapp\\resources\\");
        registry.addResourceHandler("/js/**").addResourceLocations("file:src\\main\\webapp\\js\\");
        registry.addResourceHandler("/css/**").addResourceLocations("file:src\\main\\webapp\\css\\");
        registry.addResourceHandler("/pages/**").addResourceLocations("file:src\\main\\webapp\\pages\\");
        registry.addResourceHandler("/plugins/**").addResourceLocations("file:src\\main\\webapp\\plugins\\");
    }
}
