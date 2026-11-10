package com.poly.bai3;
public class ImportedProduct extends Product {
    private double importTaxRate;
    private double shippingFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String id, String name, double basePrice, double importTaxRate, double shippingFee) {
        super(id, name, basePrice);

        if (importTaxRate < 0 || importTaxRate > 1
                || Double.isNaN(importTaxRate)
                || Double.isInfinite(importTaxRate)) {
            throw new IllegalArgumentException(
                    "Thue nhap khau phai tu 0 den 1");
        }

        if (shippingFee < 0 || Double.isNaN(shippingFee)
                || Double.isInfinite(shippingFee)) {
            throw new IllegalArgumentException(
                    "Phi van chuyen khong duoc am");
        }

        this.importTaxRate = importTaxRate;
        this.shippingFee = shippingFee;
    }

    @Override
    public double finalPrice() {
        return super.finalPrice() + super.finalPrice() * importTaxRate + shippingFee;
    }


}
