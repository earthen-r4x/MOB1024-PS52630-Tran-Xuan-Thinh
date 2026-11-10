package com.poly.bai4;

public class Order {
    private String orderId;
    private String customerName;
    private double baseFee;

    public Order() {
    }
    
    public Order(String orderId, String customerName, double baseFee) {
        this.setOrderId(orderId);
        this.setCustomerName(customerName);
        this.setBaseFee(baseFee);
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getBaseFee() {
        return baseFee;
    }

    public void setOrderId(String orderId) {
        if (orderId == null || orderId.trim().isEmpty()) {
            throw new IllegalArgumentException("Order ID cannot be null or empty");
        }
        this.orderId = orderId.trim();
    }
    
    public void setCustomerName(String customerName) {
        if (customerName == null || customerName.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be null or empty");
        }
        this.customerName = customerName.trim();
    }

    public void setBaseFee(double baseFee) {
        if (baseFee < 0) {
            throw new IllegalArgumentException("Base fee cannot be negative");
        }
        this.baseFee = baseFee;
    }

    public double shippingCost() {
        return baseFee;
    }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId + ", customerName=" + customerName + ", baseFee=" + baseFee + "]";
    }
    
    
}
