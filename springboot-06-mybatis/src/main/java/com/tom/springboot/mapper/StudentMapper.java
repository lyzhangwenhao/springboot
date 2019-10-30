package com.tom.springboot.mapper;

import com.tom.springboot.entity.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * ClassName: StudentMapper
 * Description:
 *
 * @author Mi_dad
 * @date 2019/10/15 16:24
 */
//@Mapper
public interface StudentMapper {
    /**
     * 查询全部学生信息
     * @return
     */
    @Select("select * from student")
    List<Student> findAllStudent();

    /**
     * 通过id查询学生信息
     * @param id
     * @return
     */
    @Select("select * from student where stu_id = #{id}")
    Student getStudentById(Integer id);

    /**
     * 通过id删除Student
     * @param id
     * @return
     */
    @Select("delete from student where stu_id = #{id}")
    Integer deleteStudentById(Integer id);

    /**
     * 插入Student数据
     * @param student
     * @return
     */
    @Insert("insert into student values(null,#{student.stuName},#{student.stuAge},#{student.stuAddress})")
    Integer insertStudent(@Param("student") Student student);
}
