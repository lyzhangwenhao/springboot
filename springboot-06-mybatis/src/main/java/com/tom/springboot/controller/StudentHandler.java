package com.tom.springboot.controller;

import com.tom.springboot.entity.Student;
import com.tom.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    @ResponseBody
    @GetMapping(value = "/stu/{id}")
    public Student getStudentById(@PathVariable("id")Integer id){
        Student studentById = studentService.getStudentById(id);
        System.out.println("Controller:"+studentById);
        return studentById;
    }

//    @ResponseBody
//    @GetMapping(value = "/stu/{id}")
//    public Integer deleteStudentById(@PathVariable("id")Integer id){
//        Integer i = studentService.deleteStudentById(id);
//        return i;
//
//    }

    @ResponseBody
    @GetMapping(value = "/add")
    public Integer insertStudent(){
        Student student = new Student(null,"张三",12,"北京");
        System.out.println(student);
        Integer integer = studentService.insertStudent(student);
        return integer;
    }

}
