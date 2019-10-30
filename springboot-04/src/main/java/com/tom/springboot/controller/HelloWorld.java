package com.tom.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: HelloWorld
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/14 22:02
 */
@Controller
public class HelloWorld {

    @ResponseBody
    @RequestMapping(value = "hello")
    public String helloTest(){
        return "hello world !";
    }
}
