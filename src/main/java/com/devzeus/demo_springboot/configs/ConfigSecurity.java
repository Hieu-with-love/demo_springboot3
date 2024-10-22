package com.devzeus.demo_springboot.configs;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

public class ConfigSecurity {
    @Bean
    public FilterRegistrationBean<CustomSiteMeshFilter> siteMeshFilter() {
        FilterRegistrationBean<CustomSiteMeshFilter> filterRegistrationBean = new FilterRegistrationBean<CustomSiteMeshFilter>();
        filterRegistrationBean.setFilter(new CustomSiteMeshFilter()); // adding sitemesh filter ??
        filterRegistrationBean.addUrlPatterns("/*");
        return filterRegistrationBean;
    }
}
