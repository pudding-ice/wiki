package com.myjava.wiki.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") //允许所有请求URL
                .allowedOriginPatterns("*") //允许所有来源(ip)
                .allowedHeaders(CorsConfiguration.ALL) //允许所有请求头和请求方法
                .allowedMethods(CorsConfiguration.ALL)
                .allowCredentials(true) //跨域请求的时候默认不会带上cookie,所以登录之后请求内容服务器认定你没有登录,设置这个为true就会带上cookie信息
                .maxAge(3600);         // 1小时内不需要再预检（在发送get请求之前会先发OPTIONS请求,检验服务器中是否有这个方法,有的话才会发get）

    }

}
