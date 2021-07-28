package com.myt.server;

import com.myt.mapper.StudentMapper;
import com.myt.pojo.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> getAll() {
        return studentMapper.getAll();
    }

    @Override
    public Student getStudentByID(int id) {
        return studentMapper.getStudentByID(id);
    }

    @Override
    public int delete(int id) {
        return studentMapper.delete(id);
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }


    @Override
    public int updateStudentById(Student student) {
        return studentMapper.updateStudentById(student);
    }
}
