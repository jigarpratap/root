package com.day10.day10demo.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.day10.day10demo.Entity.Employee;
@Service
public class EmployeeServiceImpl implements emoplyeeService{
    private static List<Employee> list=new ArrayList<>();
    static{
        list.add(new Employee(1,"Naruto","Uzmaki","Hokage",1000000.0));
        list.add(new Employee(1,"Sasuke","Uchiha","Shadow Hokage",1000000.0));
    }
    @Override
    public List<Employee> getAll() {
        
        return list;
    }
    @Override
    public Employee findbyId(int id) {
           for(Employee e:list){
               if(e.getEmpID()==id){
                   return e;
               }
           }
           return null;
    }
    
}
