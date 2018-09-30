package com.example.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:wjup
 * @Date: 2018/9/28 0028 10:28
 */
@Configuration
public class SessionInterceptor implements WebMvcConfigurer {

    /**
     * 自定义拦截器，添加拦截路径和排除拦截路径
     * addPathPatterns():添加需要拦截的路径
     * excludePathPatterns():添加不需要拦截的路径
     * 在括号中还可以使用集合的形式，如注释部分代码所示
     */
    //注册拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List list = new ArrayList();
//        list.add("/user/toIndex");
//        list.add("/user/loginUser");
//        list.add("/user/toRegister");
//        list.add("/user/register");
//        list.add("/user/interceptor");
        list.add("/user/**");
        list.add("/blog/**");
        list.add("/css/**");
        list.add("/fonts/**");
        list.add("/js/**");
        list.add("/img/**");
        list.add("/");
//        list.add("/static/**");//引用设定的addResourceHandler名称
        registry.addInterceptor(new UserInterceptor()).addPathPatterns("/**").excludePathPatterns(list);
    }

    /**
     * 配置静态资源
     * @param registry
     */
    /*@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        *//**
         * addResourceHandler：设定名称
         * addResourceLocations：本地路径
         *//*
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/js/","classpath:/css/");
        registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
        WebMvcConfigurer.super.addResourceHandlers(registry);
    }*/

}
