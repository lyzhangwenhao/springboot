package com.tom.springboot.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * ClassName: controller
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/14 13:11
 */
@Controller
public class ControllerTest {
    @ResponseBody
    @RequestMapping(value = "/hello")
    public String test(){
        return "hello world";
    }
}
