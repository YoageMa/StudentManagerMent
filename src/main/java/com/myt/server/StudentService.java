package com.myt.server;

import com.myt.pojo.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();

    Student getStudentByID(int id);

    int delete(int id);

    int addStudent(Student student);

    int updateStudentById(Student student);
}
