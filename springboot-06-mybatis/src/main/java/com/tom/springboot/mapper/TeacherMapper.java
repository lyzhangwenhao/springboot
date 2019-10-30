package com.tom.springboot.mapper;

import com.tom.springboot.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * ClassName: TeacherMapper
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/15 20:12
 */
//@Mapper
public interface TeacherMapper {

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
