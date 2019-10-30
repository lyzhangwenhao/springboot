package com.tom.springboot.config;

import com.tom.springboot.service.PersonService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ClassName: PersonConfig
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/14 20:46
 */
@Configuration
public class PersonConfig {
    //将方法的返回值添加到容器中，容器中这个组件默认的id是方法名
    @Bean
    public PersonService personService(){
        return new PersonService();
    }
}
