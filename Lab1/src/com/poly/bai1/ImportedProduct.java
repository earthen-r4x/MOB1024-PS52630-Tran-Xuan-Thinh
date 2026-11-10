package com.poly.bai1;
public class ImportedProduct extends Product {
    private double importTaxRate;
    private double shippingFee;

    public ImportedProduct() {
        super();
    }

    public ImportedProduct(String id, String name, double basePrice, double importTaxRate, double shippingFee) {
        super(id, name, basePrice);
        this.importTaxRate = importTaxRate;
        this.shippingFee = shippingFee;
    }

    @Override
    public double finalPrice() {
        return super.finalPrice() + super.finalPrice() * importTaxRate + shippingFee;
    }


}
