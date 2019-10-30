package com.tom.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: HelloWorld
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/15 14:33
 */
@Controller
public class HelloWorld {

    @ResponseBody
    @GetMapping(value = "/hello")
    public String hello(){
        return "<h1>Hello world</h1>";
    }

    @GetMapping(value = "/success")
    public String success(){
        return "success";
    }
}
