package com.poly.test;

public class StudentTicket extends Ticket {
    private int discountPercent;

    public StudentTicket() {
        super();
    }

    public StudentTicket(String id, String name, double basePrice, int discountPercent) {
        super(id, name, basePrice);
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public double finalPrice() {
        return super.finalPrice() * (1 - discountPercent / 100.0);
    }

    @Override
    public String toString() {
        return "StudentTicket [getId()=" + getId() + ", getName()=" + getName() + ", getBasePrice()=" + getBasePrice()
                + ", finalPrice()=" + finalPrice() + "]";
    }
}
