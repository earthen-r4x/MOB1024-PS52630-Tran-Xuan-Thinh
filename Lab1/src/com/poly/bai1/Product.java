package com.poly.bai1;
public class Product {
    private String id;
    private String name;
    private double basePrice;

    public Product() {}
    public Product(String id, String name, double basePrice) {
        this.id = id;
        this.name = name;
        this.basePrice = basePrice;
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
        if (id.isEmpty()) {
            System.out.println("ID khong duoc de trong");
        } else {
            this.id = id;
        }
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBasePrice(double basePrice) {
        if (basePrice <= 0) {
            System.out.println("Gia co ban phai lon hon 0");
        } else {
            this.basePrice = basePrice;
        }
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
