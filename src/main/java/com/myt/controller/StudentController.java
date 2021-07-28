package com.myt.controller;

import com.myt.pojo.College;
import com.myt.pojo.Student;
import com.myt.server.CollegeServiceImpl;
import com.myt.server.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller

public class StudentController {
    @Autowired
      CollegeServiceImpl collegeService;

    @Autowired
    StudentServiceImpl studentService;

    @RequestMapping("/studs")
    public String list(Model model) {
        List<Student> students = studentService.getAll();
        model.addAttribute("studs", students);
        return "stud/list";
    }

    @GetMapping("/stud")
    public String toAdd(Model model) {
        //查出部门的所有信息
        List<College> colleges = collegeService.getAll();
        model.addAttribute("colleges", colleges);
        return "stud/add";
    }

    @PostMapping("/stud")
    public String add(Student student) {
//        添加的操作
        studentService.addStudent(student);
        return "redirect:/studs";
    }

    //去员工的修改页面
    @GetMapping("/upstud/{id}")
    public String toupdataStud(@PathVariable("id") int id, Model model) {
        //查出原来的数据
        Student student = studentService.getStudentByID(id);
        model.addAttribute("stud", student);

        List<College> colleges = collegeService.getAll();
        model.addAttribute("colleges", colleges);

        return "stud/update";
    }

    @PostMapping("/updateStud")
    public String updateStud(Student student) {
        studentService.updateStudentById(student);
        return "redirect:/studs";
    }

    //删除员工
    @GetMapping("/deleteStud/{id}")
    public String deleteStud(@PathVariable("id") int id) {
        studentService.delete(id);
        return "redirect:/studs";
    }
}
