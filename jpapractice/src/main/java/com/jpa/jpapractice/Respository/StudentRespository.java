package com.jpa.jpapractice.Respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpa.jpapractice.Entity.Student;

public interface StudentRespository extends JpaRepository<Student,Long>{
    
}
