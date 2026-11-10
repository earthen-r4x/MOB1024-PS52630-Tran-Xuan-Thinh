package com.poly.cinejava.model;

public class StudentTicket extends Ticket {
    private int discountPercent;

    public StudentTicket() {
        super();
    }
    
    public StudentTicket(String id, String movie, double basePrice, int discountPercent) {
        super(id, movie, basePrice);
        this.setDiscountPercent(discountPercent);
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        if (discountPercent < 0 || discountPercent > 50) {
            System.out.println("Giam gia phai trong khoang 0-50%");
        } else {
            this.discountPercent = discountPercent;
        }
    }

    @Override
    public double finalPrice() {
        return super.getBasePrice() * (100 - discountPercent) / 100;
    }

    
    
}
