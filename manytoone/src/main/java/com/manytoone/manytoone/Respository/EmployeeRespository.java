package com.manytoone.manytoone.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manytoone.manytoone.Entity.Employee;
@Repository
public interface EmployeeRespository extends JpaRepository<Employee,Long> {
    
}
