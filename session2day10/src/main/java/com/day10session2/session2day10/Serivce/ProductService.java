package com.day10session2.session2day10.Serivce;

import java.util.List;

import com.day10session2.session2day10.Entity.Product_Management;

public interface ProductService {
      public Product_Management add(Product_Management product);
      public Product_Management delete(Integer productId);
      public Product_Management update(Product_Management product);
      public List<Product_Management> getAll();

}
