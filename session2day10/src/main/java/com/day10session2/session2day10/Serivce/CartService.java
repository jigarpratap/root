package com.day10session2.session2day10.Serivce;

import java.util.List;

import com.day10session2.session2day10.Entity.Product_Management;

public interface CartService {
    public Product_Management add(Product_Management product_Management);
    Product_Management remove(int id);
    List<Product_Management> getAll();
}

