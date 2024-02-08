package com.jpa.jpapractice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.jpapractice.Entity.Student;
import com.jpa.jpapractice.Respository.StudentRespository;
@Service
public class StudentServiceImpl implements StudentService{

    @Autowired
   private StudentRespository studentRespository;

    @Override
    public List<Student> getAllStudents() {

          return studentRespository.findAll();
    }

    @Override
    public Optional<Student> getStudentById(Long id) {
    
          return studentRespository.findById(id);
    }

    @Override
    public Student saveStudent(Student student) {
    
        return studentRespository.save(student);
    }

    @Override
    public void deleteStudent(Long id) {
    
         studentRespository.deleteById(id);
    }
    
    
}
