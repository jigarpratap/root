package com.manytoone.manytoone.Entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empid;
    private String name;
    private String role;
    
    @OneToMany(mappedBy = "emp",cascade = CascadeType.ALL)
    @JsonIgnore
    private List<Address> addlist;
    
    public Employee() {
    }
    public Employee(String name, String role, List<Address> address) {
       
        this.name = name;
        this.role = role;
        this.addlist = address;
    }
    
    public Long getEmpid() {
        return empid;
    }
    public void setEmpid(Long empid) {
        this.empid = empid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public List<Address> getAddlist() {
        return addlist;
    }
    public void setAddlist(List<Address> addlist) {
        this.addlist = addlist;
    }
    

    

}
