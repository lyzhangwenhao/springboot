//package com.tom.springboot.config;
//
//import com.alibaba.druid.pool.DruidDataSource;
//import com.alibaba.druid.support.http.StatViewServlet;
//import com.alibaba.druid.support.http.WebStatFilter;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.boot.web.servlet.FilterRegistrationBean;
//import org.springframework.boot.web.servlet.ServletRegistrationBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.sql.DataSource;
//import java.lang.reflect.Field;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// * ClassName: druid
// * Description:
// *
// * @author Mi_dad
// * @date 2019/10/15 13:59
// */
//@Configuration
//public class DruidConfig {
//    @ConfigurationProperties(prefix = "spring.datasource")
//    @Bean
//    public DataSource druid(){
//        DruidDataSource druidDataSource = new DruidDataSource();
//
//        return druidDataSource;
//    }
//
//
//
//    /**
//     * 配置Druid的监控
//     * 1、配置一个管理后台的Servlet
//     * @return
//     */
//    @Bean
//    public ServletRegistrationBean statViewServlet(){
//        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(),"/druid/*");
//        Map<String,String> map = new HashMap<>();
//
//        map.put("loginUsername","admin");
//        map.put("loginPassword","123456");
//        map.put("allow","");
//        map.put("deny","10.10.51.141");
//        bean.setInitParameters(map);
//        return bean;
//    }
//
//    /**
//     * 2、配置一个web监控的filter
//     */
//    @Bean
//    public FilterRegistrationBean webStatFilter(){
//        FilterRegistrationBean bean = new FilterRegistrationBean(new WebStatFilter());
//
//        Map<String ,String> initParams = new HashMap<>();
//        initParams.put("exclusions","*.js,*.css,/druid/*");
//
//        bean.setInitParameters(initParams);
//        bean.setUrlPatterns(Arrays.asList("/*"));
//
//        return bean;
//    }
//
//}
//
//
//
