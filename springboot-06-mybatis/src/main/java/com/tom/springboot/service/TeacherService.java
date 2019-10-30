package com.tom.springboot.service;

import com.tom.springboot.entity.Teacher;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: TeacherService
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/15 20:25
 */
public interface TeacherService {
    /**
     * 查询所有的老师
     * @return
     */
    List<Teacher> findAllTeacher();

    /**
     * 根据Id删除老师信息
     * @param id
     * @return
     */
    Integer deleteTeacherById(Integer id);
}
