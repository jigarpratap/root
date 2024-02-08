package com.mapping.singlemapping.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapping.singlemapping.Entity.Passport;
import com.mapping.singlemapping.Respository.PassportRespository;

@Service
public class PassportService {
    @Autowired
    PassportRespository passportRespository;

    public List<Passport> getAllPassport(){
        return passportRespository.findAll();
    }

    public Optional<Passport> getPassportById(Long id){
        return passportRespository.findById(id);
    }

    public Passport savePassport(Passport p){
        return passportRespository.save(p);
    }

    public void deleteById(Long id){
        passportRespository.deleteById(id);
    }
}
