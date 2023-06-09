package com.itstudy.config;

import org.springframework.context.annotation.*;
import org.springframework.stereotype.Controller;

@Configuration
//@ComponentScan({"com.itstudy.service", "com.itstudy.dao"})
/*
 * 按照注解的方式排除掉@Controller注解的bean
 * */
@ComponentScan(value = "com.itstudy",
        excludeFilters = @ComponentScan.Filter(type = FilterType.ANNOTATION, classes = Controller.class))
@PropertySource({"classpath:jdbc.properties"})
@Import({JdbcConfig.class, MyBatisConfig.class})
public class SpringConfig {
}
