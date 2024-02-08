package com.manytoone.manytoone.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manytoone.manytoone.Entity.Employee;
import com.manytoone.manytoone.Respository.EmployeeRespository;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRespository employeeRespository;

    public List<Employee> getAllEmployee(){
        return employeeRespository.findAll();
    }

    public Optional<Employee> getEmployeeById(Long id){
        return employeeRespository.findById(id);
    }
    public Employee saveEmployee(Employee e){
        return employeeRespository.save(e);
    }
    public void deleteById(Long id){
        employeeRespository.deleteById(id);
    }
}
