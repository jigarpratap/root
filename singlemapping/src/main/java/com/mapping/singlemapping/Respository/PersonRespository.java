package com.mapping.singlemapping.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mapping.singlemapping.Entity.Person;
@Repository
public interface PersonRespository extends JpaRepository<Person,Long> {
    
}
