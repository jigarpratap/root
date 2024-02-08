package com.day10session2.session2day10.Entity;

public class cart {
    private Product_Management product_Management;
    private int quantiy;
    public cart(){

    }
    public cart(Product_Management product_Management, int quantiy) {
        this.product_Management = product_Management;
        this.quantiy = quantiy;
    }
    public Product_Management getProduct_Management() {
        return product_Management;
    }
    public void setProduct_Management(Product_Management product_Management) {
        this.product_Management = product_Management;
    }
    public int getQuantiy() {
        return quantiy;
    }
    public void setQuantiy(int quantiy) {
        this.quantiy = quantiy;
    }
    
    
    
}
