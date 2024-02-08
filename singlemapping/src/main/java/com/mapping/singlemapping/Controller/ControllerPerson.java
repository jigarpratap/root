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

import com.mapping.singlemapping.Entity.Person;
import com.mapping.singlemapping.Service.PersonService;

@RestController
@RequestMapping("/person")
public class ControllerPerson {
    
    @Autowired
    private PersonService personService;
    
    @GetMapping
    public List<Person> getAllPerson(){
        return personService.getAllPerson();
    }
    
    @GetMapping("/{id}")
    public Optional<Person> getPersonById(@PathVariable Long id){
        return personService.getPersonById(id);
    } 
     @PostMapping
    public Person  savePerson(@RequestBody Person person){
       return personService.SavePerson(person);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        personService.deletePerson(id);
    }

    @PostMapping("/existing")
    public Person saveExistingOne(Person person){
       return personService.saveExistingOne(person);
    }
}
