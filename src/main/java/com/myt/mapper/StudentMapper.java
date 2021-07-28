package com.myt.mapper;

import com.myt.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository

public interface StudentMapper {
    List<Student> getAll();

    Student getStudentByID(@Param("id") int id);

    int delete(@Param("id") int id);


    int addStudent(Student student);

    int updateStudentById(Student student);

}
