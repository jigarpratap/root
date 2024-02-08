package com.day10.day10demo.Entity;

public class Employee {
    private int empID;
    private String firstName;
    private String secondName;
    private String position;
    private double salary;
    public Employee() {
    }
    public Employee(int empID, String firstName, String secondName, String position, double salary) {
        this.empID = empID;
        this.firstName = firstName;
        this.secondName = secondName;
        this.position = position;
        this.salary = salary;
    }
    public int getEmpID() {
        return empID;
    }
    public void setEmpID(int empID) {
        this.empID = empID;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getSecondName() {
        return secondName;
    }
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    
}
