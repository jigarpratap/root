package com.jpa.jpapractice.service;

import java.util.List;
import java.util.Optional;

import com.jpa.jpapractice.Entity.Student;

public interface StudentService {
    List<Student> getAllStudents();
    public Optional<Student> getStudentById(Long id);
    public Student saveStudent(Student student);
    public void deleteStudent(Long id);
}
