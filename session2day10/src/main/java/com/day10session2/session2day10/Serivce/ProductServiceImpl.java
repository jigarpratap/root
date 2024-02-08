package com.day10session2.session2day10.Serivce;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.day10session2.session2day10.Entity.Product_Management;
@Service
public class ProductServiceImpl implements ProductService {

    private ArrayList<Product_Management> list=new ArrayList<>();

    @Override
    public Product_Management add(Product_Management product) {
        
        list.add(product);
        return product;
       
    }

    @Override
    public Product_Management delete(Integer productId) {
    
          for(Product_Management p:list){
             if(p.getProductId()==productId){
                 list.remove(p);
                 return p;
             }
          }
          return null;
    }

    @Override
    public Product_Management update(Product_Management product) {
    
          for(Product_Management p: list){
            if(p.getProductId()==product.getProductId()){
                p.setProductId(product.getProductId());
                p.setProductName(product.getProductName());
                p.setPrice(product.getPrice());
                p.setStockQuantity(product.getStockQuantity());
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
