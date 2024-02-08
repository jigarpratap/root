package com.manytoone.manytoone.Entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Address {
    
     @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String type;

     @ManyToOne(cascade = CascadeType.ALL)
     @JoinColumn(name="e_id" ,referencedColumnName="empid")
     private Employee emp;
    
    public Address() {
    }
    public Address(String type, Employee emp) {
        
        this.type = type;
        this.emp = emp;
    }
    public Long getAid() {
        return id;
    }
    public void setAid(Long aid) {
        this.id = aid;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public Employee getEmp() {
        return emp;
    }
    public void setEmp(Employee emp) {
        this.emp = emp;
    }
    
     



}
