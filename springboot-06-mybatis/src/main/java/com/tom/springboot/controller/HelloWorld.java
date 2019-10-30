package com.tom.springboot.controller;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.sql.DataSource;

/**
 * ClassName: HelloWorld
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/15 14:33
 */
@Controller
public class HelloWorld {

    @GetMapping(value = "/hello")
    public String hello(){

        System.out.println();
        return "dashboard";
    }

//    @GetMapping(value = "/success")
//    public String success(){
//        return "success";
//    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(){
        return "list";
    }

    @RequestMapping(value = "/login")
    public String loginHtml(){
        return "login";
    }

    @RequestMapping(value = "/test")
    public String test(){
        return "list";
    }
}
