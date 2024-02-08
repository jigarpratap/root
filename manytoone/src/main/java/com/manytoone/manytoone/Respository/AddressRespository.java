package com.manytoone.manytoone.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.manytoone.manytoone.Entity.Address;
@Repository
public interface AddressRespository extends JpaRepository<Address,Long>{
    
}
