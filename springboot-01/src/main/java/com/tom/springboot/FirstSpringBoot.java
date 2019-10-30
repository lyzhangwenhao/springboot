package com.tom.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: FirstSpringBoot
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/14 11:21
 */
@SpringBootApplication
@Controller
public class FirstSpringBoot {

    @RequestMapping(value = "/demo")
    public String firstTest(){
        return "hello world!";
    }
    public static void main(String[] args) {
        SpringApplication.run(FirstSpringBoot.class);
    }
}
