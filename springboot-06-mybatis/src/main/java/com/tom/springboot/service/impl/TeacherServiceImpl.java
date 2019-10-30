package com.tom.springboot.service.impl;

import com.tom.springboot.entity.Teacher;
import com.tom.springboot.mapper.TeacherMapper;
import com.tom.springboot.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: TeacherServiceImpl
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/15 20:25
 */
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    /**
     * 查询所有的老师
     *
     * @return
     */
    @Override
    public List<Teacher> findAllTeacher() {
        List<Teacher> allTeacher = teacherMapper.findAllTeacher();
        for (Teacher t:allTeacher){
            System.out.println(t);
        }
        return allTeacher;
    }

    /**
     * 根据Id删除老师信息
     *
     * @param id
     * @return
     */
    @Override
    public Integer deleteTeacherById(Integer id) {
        return teacherMapper.deleteTeacherById(id);
    }
}
