package com.tom.springboot.service.impl;

import com.tom.springboot.entity.Student;
import com.tom.springboot.mapper.StudentMapper;
import com.tom.springboot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: StudentService
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/15 16:31
 */
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    /**
     * 查询全部学生信息
     *
     * @return
     */
    @Override
    public List<Student> findAllStudent() {
        return studentMapper.findAllStudent();
    }

    /**
     * 通过id查询学生信息
     *
     * @param id
     * @return
     */
    @Override
    public Student getStudentById(Integer id) {
        return studentMapper.getStudentById(id);
    }

    /**
     * 通过id删除Student
     *
     * @param id
     * @return
     */
    @Override
    public int deleteStudentById(Integer id) {
        return studentMapper.deleteStudentById(id);
    }

    /**
     * 插入Student数据
     *
     * @param student
     * @return
     */
    @Override
    public int insertStudentById(Student student) {
        return studentMapper.insertStudentById(student);
    }
}
