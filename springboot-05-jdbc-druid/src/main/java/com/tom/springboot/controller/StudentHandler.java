package com.tom.springboot.controller;

import com.tom.springboot.entity.Student;
import com.tom.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * ClassName: StudentHandler
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/15 16:34
 */
@Controller
public class StudentHandler {
    @Autowired
    private StudentService studentService;

    @ResponseBody
    @GetMapping(value = "/stu")
    public List<Student> findAddStudent(){
        return studentService.findAllStudent();
    }
}
