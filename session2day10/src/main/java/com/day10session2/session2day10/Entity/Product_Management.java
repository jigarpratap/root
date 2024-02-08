package com.day10session2.session2day10.Entity;

public class Product_Management {
   private Integer productId;
   private String productName;
   private Double price;
   private Integer stockQuantity;
public Product_Management() {
}
public Product_Management(Integer productId, String productName, Double price, Integer stockQuantity) {
    this.productId = productId;
    this.productName = productName;
    this.price = price;
    this.stockQuantity = stockQuantity;
}
public Integer getProductId() {
    return productId;
}
public void setProductId(Integer productId) {
    this.productId = productId;
}
public String getProductName() {
    return productName;
}
public void setProductName(String productName) {
    this.productName = productName;
}
public Double getPrice() {
    return price;
}
public void setPrice(Double price) {
    this.price = price;
}
public Integer getStockQuantity() {
    return stockQuantity;
}
public void setStockQuantity(Integer stockQuantity) {
    this.stockQuantity = stockQuantity;
}


}
