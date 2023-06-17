package com.itstudy.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
public class MyBatisConfig{

    /*
    * 专门获取SqlSessionFactory的bean的方法
    * */
    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource) {
        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
        ssfb.setTypeAliasesPackage("com.itstudy.domain");
        ssfb.setDataSource(dataSource);
        return ssfb;
    }

    /*
    * Mapper映射配置
    * */
    @Bean
    public MapperScannerConfigurer mapperScannerConfigurer() {
        MapperScannerConfigurer msc = new MapperScannerConfigurer();
        msc.setBasePackage("com.itstudy.dao");
        return msc;
    }

}
