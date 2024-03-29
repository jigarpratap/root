package com.jpa.jpapractice.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.jpapractice.Entity.Student;
import com.jpa.jpapractice.service.StudentServiceImpl;

@RestController
@RequestMapping("/api/student")
public class StudentController {
    
    @Autowired
    StudentServiceImpl studentServiceImpl;
    @GetMapping
    public List<Student> getAllStudents(){
      return studentServiceImpl.getAllStudents();
    }

    @GetMapping("/{id}")
    public Optional<Student> getStudentById(@PathVariable Long id){
        return studentServiceImpl.getStudentById(id);
    }

    @PostMapping
    public Student saveStudent(Student student){
        return studentServiceImpl.saveStudent(student);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        studentServiceImpl.deleteStudent(id);
    }
}
