package com.tom.springboot.config;

import com.tom.springboot.componet.MyLocaleConfig;
import com.tom.springboot.interceptor.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;

/**
 * ClassName: SpringMvcConfig
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/16 14:40
 */
@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {
    @Autowired
    private LoginInterceptor l;

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/").setViewName("login");
//        registry.addViewController("/index.html").setViewName("login");
//    }

//    @Bean
//    public LoginInterceptor getLoginInterceptor(){
//        return new LoginInterceptor();
//    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        System.out.println(1111);
        registry.addInterceptor(l).excludePathPatterns("/login","/asserts/**").addPathPatterns("/**");
    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleConfig();
    }


}
