package com.day10.day10demo.Services;

import java.util.List;

import com.day10.day10demo.Entity.Employee;

public interface emoplyeeService {
        public List<Employee> getAll();   
        public Employee findbyId(int id); 
}
