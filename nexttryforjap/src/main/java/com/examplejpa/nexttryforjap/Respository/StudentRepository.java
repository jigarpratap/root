package com.examplejpa.nexttryforjap.Respository;

 
import org.springframework.data.jpa.repository.JpaRepository;

import com.examplejpa.nexttryforjap.Entity.Student;
 

 
public interface StudentRepository extends JpaRepository<Student, Long>{
    //you can add custome query methods
   
}
