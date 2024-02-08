package com.day10session2.session2day10.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.day10session2.session2day10.Entity.Product_Management;
import com.day10session2.session2day10.Entity.UserDetail;
import com.day10session2.session2day10.Serivce.CartServiceImpl;
import com.day10session2.session2day10.Serivce.ProductServiceImpl;
import com.day10session2.session2day10.Serivce.UserServiceImpl;

@RestController
public class ControllerManagement {
    @Autowired
    CartServiceImpl cartServiceImpl;
    @Autowired
    ProductServiceImpl productServiceImpl;
    @Autowired
    UserServiceImpl userServiceImpl;
    
    @GetMapping("/user")
    public List<UserDetail> getAll1(){
        return userServiceImpl.getAll();
    } 
    @PostMapping("/user/{userDeatil}")
    public UserDetail addUser(@RequestBody UserDetail userDetail) {

          userServiceImpl.addUser(userDetail);
          return userDetail;
    }
    @GetMapping("/cart")
    public List<Product_Management> getAll() {
        return cartServiceImpl.getAll();
    }

    @PostMapping("/cart/add/{cart}")
    public Product_Management add(@RequestBody Product_Management product_Management) {
        cartServiceImpl.add(product_Management);
        return product_Management;
    }
    @GetMapping("/cart/remove/{id}")
    public String Remove(@PathVariable int id){
            if(cartServiceImpl.remove(id)!=null){
                return "It got removed";
            }else{
                  return "Not found such element";
            }
    }

    @PostMapping("/add")
    public String add1(@RequestBody Product_Management product) {
    
        if(productServiceImpl.add(product)!=null);
        {
         return "productAdded";
        
        }
        
    }
   @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        if(productServiceImpl.delete(id)!=null){
            return "Delete";
        }else{
            return "Could not find the element";
        }

    }
    @PostMapping("/update")
   public String update(@RequestBody Product_Management product)
   {
    if(productServiceImpl.update(product)!=null){
        return "updated";
    }else{
        return "No such element exist that can be updated";
    }
   }
   @GetMapping("/product")
   public List<Product_Management> getAll2() {

     return productServiceImpl.getAll();
}


}
