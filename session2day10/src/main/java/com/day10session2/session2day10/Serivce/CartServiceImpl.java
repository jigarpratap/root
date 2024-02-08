package com.day10session2.session2day10.Serivce;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.day10session2.session2day10.Entity.Product_Management;
@Service
public class CartServiceImpl implements CartService{

   private List<Product_Management> list=new ArrayList<>();

    @Override
    public Product_Management add(Product_Management product_Management) {
    
        list.add(product_Management);
        return product_Management;
    
    }

    @Override
    public Product_Management remove(int id) {
        
        for(Product_Management p:list){
             if(p.getProductId()==id){
               list.remove(p);
               return p;
                
             }
        }
        return null;
    }

    @Override
    public List<Product_Management> getAll() {
    
        return list;
    }
    
}
