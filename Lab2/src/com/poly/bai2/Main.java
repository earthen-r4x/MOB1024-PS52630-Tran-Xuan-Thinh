package com.poly.bai2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("P001", "Heo Quay", 50000.0, ProductCategory.FOOD));
        products.add(new Product("P002", "Ca kho", 25000.0, ProductCategory.FOOD));
        products.add(new Product("P003", "Ao T", 125000.0, ProductCategory.CLOTHING));
        products.add(new Product("P004", "Module", 1000000.0, ProductCategory.ELECTRONIC));
        products.add(new Product("P005", "Ga chien", 100000.0, ProductCategory.FOOD));
        products.add(new Product("P006", "Quan Jean", 75000.0, ProductCategory.CLOTHING));
        products.add(new Product("P007", "Day dong", 500000.0, ProductCategory.ELECTRONIC));
        products.add(new Product("P008", "Banh rang", 100000.0, ProductCategory.ELECTRONIC));
    
        System.out.println("=== Danh sach san pham ===");
        for (Product product : products) System.out.println(product);

        System.out.println("\n=== Thong ke so luong mat hang ===");
        Map<ProductCategory, Integer> countI = new HashMap<>();
        for (ProductCategory pc : ProductCategory.values()) {
            int count = 0;
            for (Product p : products) {
                if (p.getCategory() == pc) {
                    count++;
                }
            }
            countI.put(pc, count);
            System.out.println(pc.getDescription() + ": " + count);
        }
        
        System.out.println("\n=== Thong ke gia tri san pham ===");
        Map<ProductCategory, Double> countD = new HashMap<>();
        for (ProductCategory pc : ProductCategory.values()) {
            double worth = 0.0;
            for (Product p : products) {
                if (p.getCategory() == pc) {
                    worth += p.getPrice();
                }
            }
            countD.put(pc, worth);
            System.out.println(pc.getDescription() + ": " + worth);
        }
    }
    
}
