package com.poly.bai4;

public class ExpressOrder extends Order {
    private double expressSurcharge;
    private double insuranceFee;

    public ExpressOrder() {
        super();
    }

    public ExpressOrder(String orderId, String customerName, double baseFee, double expressSurcharge, double insuranceFee) {
        super(orderId, customerName, baseFee);
        this.setExpressSurcharge(expressSurcharge);
        this.setInsuranceFee(insuranceFee);
    }

    public double getExpressSurcharge() {
        return expressSurcharge;
    }

    public double getInsuranceFee() {
        return insuranceFee;
    }

    public void setExpressSurcharge(double expressSurcharge) {
        if (expressSurcharge < 0) {
            throw new IllegalArgumentException("Express surcharge cannot be negative");
        }
        this.expressSurcharge = expressSurcharge;
    }

    public void setInsuranceFee(double insuranceFee) {
        if (insuranceFee < 0) {
            throw new IllegalArgumentException("Insurance fee cannot be negative");
        }
        this.insuranceFee = insuranceFee;
    }

    @Override
    public double shippingCost() {
        return super.shippingCost() + expressSurcharge + insuranceFee;
    }

    @Override
    public String toString() {
        return super.toString() + ", Express Surcharge: " + expressSurcharge 
                + ", Insurance Fee: " + insuranceFee 
                + ", Shipping Cost: " + shippingCost();
    }
    
    
}
