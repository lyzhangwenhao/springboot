package com.tom.springboot.controller;

import com.tom.springboot.entity.Teacher;
import com.tom.springboot.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ClassName: TeacherHandler
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/15 20:29
 */
@Controller
public class TeacherHandler {
    @Autowired
    private TeacherService teacherService;

    @ResponseBody
    @GetMapping(value = "/tea")
    public List<Teacher> findAllTeacher(){
        return teacherService.findAllTeacher();
    }

    @ResponseBody
    @GetMapping(value = "/tea/{id}")
    public Integer deleteTeacherById(@PathVariable("id")Integer id){
        return teacherService.deleteTeacherById(id);
    }
}
