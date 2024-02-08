package com.example.ltijava.demoproject.entity;

public class HelloBean {
    private String message;
    private int a;
    private int b;
    public int getA() {
        return a;
    }
    public HelloBean(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public HelloBean(){
        
    }
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HelloBean(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "HelloBean [a=" + a + ", b=" + b + "]";
    }
    
    
}
