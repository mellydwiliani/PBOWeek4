package com.polban.jtk.sales;

public class Main {
    public static void main(String[] args) {
        Product produk = new Product("Laptop", 10000000, 10);
        
        Sales jual = new Sales(produk);
        
        jual.sellProduct(5);
        
        jual.restockProduct(10);
        
        jual.updateProductPrice(12000000);
        
        jual.updateProductPrice(-15000000);         
    }   
}
