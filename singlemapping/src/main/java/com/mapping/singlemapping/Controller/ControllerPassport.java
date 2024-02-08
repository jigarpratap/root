package com.mapping.singlemapping.Controller;

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

import com.mapping.singlemapping.Entity.Passport;
import com.mapping.singlemapping.Service.PassportService;

@RestController
@RequestMapping("/passport")
public class ControllerPassport {
    
    @Autowired
    PassportService passportService;
    @GetMapping
    public List<Passport> getAllPassport(){
        return passportService.getAllPassport();
    } 
    @GetMapping("/{id}")
    public Optional<Passport> getPassportById(@PathVariable Long id){
        return passportService.getPassportById(id);
    }
    @PostMapping
    public Passport savePassport(@RequestBody Passport p){
        return passportService.savePassport(p);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        passportService.deleteById(id);
    }
    
}
