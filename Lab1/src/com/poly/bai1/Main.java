package com.poly.bai1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("P001", "Product 1", 100.0));
        products.add(new Product("P002", "Product 2", 300.0));
        products.add(new ImportedProduct("IP001", "Imported Product 1", 200.0, 0.1, 20.0));
        products.add(new ImportedProduct("IP002", "Imported Product 2", 400.0, 0.15, 30.0));
        products.add(new ImportedProduct("IP003", "Imported Product 3", 300.0, 0.2, 5.5));
    
        // Print
        for (Product p : products) {
            System.out.println(p.toString() + ", finalPrice=" + p.finalPrice());
        }
        
        // Highest final price
        Product highestFinalPriceProduct = products.get(0);
        for (Product p : products) {
            if (p.finalPrice() > highestFinalPriceProduct.finalPrice()) {
                highestFinalPriceProduct = p;
            }
        }
        System.out.println("Product with highest final price: " + highestFinalPriceProduct.toString() + ", finalPrice=" + highestFinalPriceProduct.finalPrice());
    }
}
