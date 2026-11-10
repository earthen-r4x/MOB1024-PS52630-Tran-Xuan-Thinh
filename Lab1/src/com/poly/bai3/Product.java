package com.poly.bai3;
public class Product {
    private String id;
    private String name;
    private double basePrice;

    public Product() {}
    
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Product(String id, String name, double basePrice) {
        setId(id);
        setName(name);
        setBasePrice(basePrice);
    }
    
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasePrice() {
        return basePrice;
    }
    
    public void setId(String id) {
        if (id == null || id.trim().isEmpty()) {
            throw new IllegalArgumentException("ID khong duoc de trong");
        }
        this.id = id;
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Ten khong duoc de trong");
        }
        this.name = name;
    }

    public void setBasePrice(double basePrice) {
        if (basePrice <= 0 || Double.isNaN(basePrice)
                || Double.isInfinite(basePrice)) {
            throw new IllegalArgumentException("Gia co ban phai lon hon 0");
        }
        this.basePrice = basePrice;
    }


    public double finalPrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", basePrice=").append(basePrice);
        sb.append('}');
        return sb.toString();
    }


}
