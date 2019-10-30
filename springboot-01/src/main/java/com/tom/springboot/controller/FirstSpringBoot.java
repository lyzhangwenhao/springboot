package com.tom.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ClassName: FirstSpringBoot
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/14 11:23
 */
@Controller
public class FirstSpringBoot {

    @RequestMapping(value = "/hello")
    public String firstTest(){
        return "hello world!";
    }
    @RequestMapping(value = "/hello1")
    public String firstTest1(){
        return "hello world!";
    }
}
