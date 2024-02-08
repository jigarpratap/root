package com.mapping.singlemapping.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.singlemapping.Entity.Passport;
import com.mapping.singlemapping.Entity.Person;
import com.mapping.singlemapping.Respository.PassportRespository;
import com.mapping.singlemapping.Respository.PersonRespository;
@Service
public class PersonService {
    @Autowired
    private PersonRespository personRespository;
    
    @Autowired 
    PassportRespository passportRespository;

    public List<Person> getAllPerson(){
        return personRespository.findAll();
    }
    
    public Optional<Person> getPersonById(Long id){
        return personRespository.findById(id);
    }
    
    public Person SavePerson(Person person){
        return personRespository.save(person);
    }
    public void deletePerson(Long id){
        personRespository.deleteById(id);
    }
    public Person saveExistingOne(Person person){
         Person p=new Person();
          p.setName(person.getName());
          p.setPassport(passportRespository.findById(person.getPassport().getId()).get());
          return personRespository.save(p);
    }

    
}
