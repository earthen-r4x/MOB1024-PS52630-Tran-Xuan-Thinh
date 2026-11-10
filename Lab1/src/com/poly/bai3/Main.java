package com.poly.bai3;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        Object[][] data = {
            {"P001", "Laptop", 15000000.0, 0.0, 0.0},
            {"P002", "Mouse", 250000.0, 0.0, 0.0},
            {"IP001", "iPhone", 20000000.0, 0.10, 50000.0},
            {"IP002", "Keyboard", 1200000.0, 0.15, 30000.0},
            {"IP003", "Monitor", 4500000.0, 0.20, 100000.0},
            {"", "Headphone", 800000.0, 0.10, 20000.0},
            {"P007", "Webcam", -500000.0, 0.0, 0.0},
            {"IP008", "Tablet", 6000000.0, 1.5, 50000.0},
            {"P009", "Monitor 2", 3200000.0, 0.0, 0.0},
            {"IP010", "Camera", 9000000.0, 0.08, 75000.0}
        };

        for (Object[] d : data) {
            try {
                String id = (String) d[0];
                String name = (String) d[1];
                double price = (double) d[2];
                double tax = (double) d[3];
                double shipping = (double) d[4];

                Product p;

                if (id.startsWith("IP")) {
                    p = new ImportedProduct(
                        id, name, price, tax, shipping
                    );
                } else {
                    p = new Product(id, name, price);
                }

                products.add(p);
                System.out.println("OK: " + p);

            } catch (IllegalArgumentException e) {
                System.out.println("ERROR: " + e.getMessage());
            }
        }
    
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
