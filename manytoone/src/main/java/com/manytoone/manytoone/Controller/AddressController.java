package com.manytoone.manytoone.Controller;

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

import com.manytoone.manytoone.Entity.Address;
import com.manytoone.manytoone.Service.AddressService;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    AddressService addressService;


    @GetMapping
    public List<Address> getAllAddresses(){
        
        return addressService.getAllAddress();
    }

    @GetMapping("/{id}")
    public Optional<Address> getAddressById(@PathVariable Long id)
    {
        return addressService.getByAddressId(id);
    }

    @PostMapping
    public Address saveAddress(@RequestBody Address a){
        return addressService.saveAddress(a);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        addressService.deleteById(id);
    }

}
