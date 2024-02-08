package com.day10.day10demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.day10.day10demo.Entity.Employee;
import com.day10.day10demo.Services.EmployeeServiceImpl;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    EmployeeServiceImpl employeeServiceImpl;

    @GetMapping
    public List<Employee> getAll(){
       return  employeeServiceImpl.getAll();
    }
    @GetMapping("/{id}")
    public Employee findById(@PathVariable int id){
       Employee e=employeeServiceImpl.findbyId(id);
       if(e!=null){
          return e;
       }else{
        return null;
       }
    }


}
