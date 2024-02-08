package com.mapping.singlemapping.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.singlemapping.Entity.Passport;
@Repository
public interface PassportRespository extends JpaRepository<Passport, Long>{
    
}
