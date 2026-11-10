package com.poly.bai2;

public enum ProductCategory {
    FOOD("Thuc pham"),
    ELECTRONIC("Dien tu"),
    CLOTHING("Quan ao");

    private final String description;

    private ProductCategory(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
