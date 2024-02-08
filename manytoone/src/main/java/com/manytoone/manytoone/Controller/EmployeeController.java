package com.manytoone.manytoone.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.manytoone.manytoone.Entity.Employee;
import com.manytoone.manytoone.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping
    public List<Employee> getAllEmployee(){
        return employeeService.getAllEmployee();
    }
    @GetMapping("/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return employeeService.getEmployeeById(id);
    }
    @PostMapping
    public Employee  saveEmployee(@RequestBody Employee e){
        return employeeService.saveEmployee(e);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        employeeService.deleteById(id);
    }
    
}
