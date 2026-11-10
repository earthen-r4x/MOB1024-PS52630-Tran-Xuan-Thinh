package com.poly.bai2;

public class Product {
    public String id;
    public String name;
    public double price;
    public ProductCategory category;
    
    public Product(String id, String name, double price, ProductCategory category) {
        this.setId(id);
        this.setName(name);
        this.setPrice(price);
        this.category = category;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if (id.trim().isEmpty() || id == null) {
            throw new IllegalArgumentException ("ID khong duoc de trong");
        } else {
            this.id = id;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.trim().isEmpty() || name == null) {
            throw new IllegalArgumentException("Ten khong duoc de trong");
        } else {
            this.name = name;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Gia phai la so nguyen");
        } else {
            this.price = price;
        }
    }

    public ProductCategory getCategory() {
        return category;
    }

    public void setCategory(ProductCategory category) {
        if (category == null) {
            throw new IllegalArgumentException("Loai khong duoc de trong");
        } else {
            this.category = category;
        }
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
    }
}
