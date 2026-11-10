package com.poly.bai4;

public class InternationalOrder extends Order {
    private double weightKg;
    private double customsFee;

    public InternationalOrder() {
        super();
    }

    public InternationalOrder(String orderId, String customerName, double baseFee, double weightKg, double customsFee) {
        super(orderId, customerName, baseFee);
        this.setWeightKg(weightKg);
        this.setCustomsFee(customsFee);
    }

    public double getWeightKg() {
        return weightKg;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setWeightKg(double weightKg) {
        if (weightKg < 0) {
            throw new IllegalArgumentException("Weight cannot be negative");
        }
        this.weightKg = weightKg;
    }

    public void setCustomsFee(double customsFee) {
        if (customsFee < 0) {
            throw new IllegalArgumentException("Customs fee cannot be negative");
        }
        this.customsFee = customsFee;
    }

    @Override
    public double shippingCost() {
        return super.shippingCost() + weightKg * 20000 + customsFee;
    }

    @Override
    public String toString() {
        return super.toString() + ", Weight (kg): " + weightKg + ", Customs Fee: " + customsFee;
    }
}
