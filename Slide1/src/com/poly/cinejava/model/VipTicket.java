package com.poly.cinejava.model;

public class VipTicket extends Ticket {
    private double surchargeRate;
    private double comboFee;
    
    public VipTicket() {
        super();
    }

    public VipTicket(String id, String movie, double basePrice, double surchargeRate, double comboFee) {
        super(id, movie, basePrice);
        this.setSurchargeRate(surchargeRate);
        this.setComboFee(comboFee);
    }

    public double getSurchargeRate() {
        return surchargeRate;
    }

    public double getComboFee() {
        return comboFee;
    }

    public void setSurchargeRate(double surchargeRate) {
        if (surchargeRate < 0 || surchargeRate > 1) {
            System.out.println("Phu thu phai trong khoang 0-1");
        } else {
            this.surchargeRate = surchargeRate;
        }
    }

    public void setComboFee(double comboFee) {
        if (comboFee < 0) {
            System.out.println("Phi combo phai >= 0");
        } else {
            this.comboFee = comboFee;
        }
    }

    @Override
    public double finalPrice() {
        return super.getBasePrice() + super.getBasePrice() * surchargeRate + comboFee;
    }

    
    
}