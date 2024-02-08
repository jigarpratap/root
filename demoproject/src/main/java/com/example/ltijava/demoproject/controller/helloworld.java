package com.example.ltijava.demoproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.ltijava.demoproject.entity.HelloBean;

@RestController
public class helloworld {
    @GetMapping("/hello")
    public String hello(){
        return "Welcome to spring boot Example";
    }
    @GetMapping("/bean")
    public HelloBean hellobean(){
        return new HelloBean("Hello world");
    }
    @GetMapping("/path/{name}")
    public HelloBean path(@PathVariable String name){
        return new HelloBean(String.format("Hello, %s", name));
    }
    @GetMapping("/add/{a}/{b}")
    public int add(@PathVariable int a, @PathVariable int b){
        return a+b;
    }
}
