package com.lucky.mall.admin.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * MyBatis配置类
 * Created by macro on 2019/4/8.
 */
@Configuration
@EnableTransactionManagement
@MapperScan({"com.lucky.mall.mbg.mapper","com.lucky.mall.admin.dao"})
public class MyBatisConfig {
//    @Bean
//    public FilterRegistrationBean<MallFilter> regist(){
//        FilterRegistrationBean bean= new FilterRegistrationBean(new MallFilter());
//        return bean;
//    }
}
