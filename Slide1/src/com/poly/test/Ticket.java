package com.poly.test;

public class Ticket {
    private String id;
    private String name;
    private double basePrice;

    public Ticket() {
    }

    public Ticket(String id, String name, double basePrice) {
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
        if (id == null || id.trim().isEmpty()) {
            System.out.println("ID khong duoc de trong");
        } else {
            this.id = id;
        }
    }

    public void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Name khong duoc de trong");
        } else {
            this.name = name;
        }
    }

    public void setBasePrice(double basePrice) {
        if (basePrice < 0) {
            System.out.println("Gia ve khong duoc am");
        } else {
            this.basePrice = basePrice;
        }
    }

    public double finalPrice() {
        return basePrice;
    }

    @Override
    public String toString() {
        return "Ticket [id=" + id + ", name=" + name + ", basePrice=" + basePrice + ", finalPrice()=" + finalPrice()
                + "]";
    }

    
}
