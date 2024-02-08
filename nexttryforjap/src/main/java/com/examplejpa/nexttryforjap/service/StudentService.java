package com.examplejpa.nexttryforjap.service;

 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.examplejpa.nexttryforjap.Entity.Student;
import com.examplejpa.nexttryforjap.Respository.StudentRepository;

import java.util.Optional;
import java.util.List;
@Service
public class StudentService {
 
    @Autowired
    private StudentRepository studentRepository;
 
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
 
    public Optional<Student> getStudentById(Long id){
        return studentRepository.findById(id);
    }
 
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }
 
    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
 
    public Optional<Student> updateStudent(Long id, Student updatedStudent){
        return studentRepository.findById(id).map(student ->{
            student.setFirstName(updatedStudent.getFirstName());
            student.setLastName(updatedStudent.getLastName());
            student.setEmail(updatedStudent.getEmail());
            return studentRepository.save(student);
        });
           
    }
   
 
   
   
   
}
