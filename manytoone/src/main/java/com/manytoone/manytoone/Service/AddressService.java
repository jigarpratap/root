package com.manytoone.manytoone.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manytoone.manytoone.Entity.Address;
import com.manytoone.manytoone.Respository.AddressRespository;

@Service
public class AddressService {
    
    @Autowired
    private AddressRespository addressRespository;

    public List<Address> getAllAddress(){
        return addressRespository.findAll();
    }

    public Optional<Address> getByAddressId(Long id){
        return addressRespository.findById(id);
    }

    public Address saveAddress(Address a){
        return addressRespository.save(a);
    }

    public void deleteById(Long id){
        addressRespository.deleteById(id);
    }
}
