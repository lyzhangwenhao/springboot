package com.tom.springboot.service;

import com.tom.springboot.entity.Student;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: StudentService
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/15 16:31
 */
public interface StudentService {

    /**
     * 查询全部学生信息
     * @return
     */
    List<Student> findAllStudent();

    /**
     * 通过id查询学生信息
     * @param id
     * @return
     */
    Student getStudentById(Integer id);

    /**
     * 通过id删除Student
     * @param id
     * @return
     */
    Integer deleteStudentById(Integer id);

    /**
     * 插入Student数据
     * @param student
     * @return
     */
    Integer insertStudent(Student student);
}
