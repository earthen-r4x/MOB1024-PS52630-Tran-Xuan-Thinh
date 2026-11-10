package com.poly.bai1;

public enum StudentType {
    REGULAR("Sinh vien chinh quy"),
    PART_TIME("Sinh vien vua di hoc vua di lam"),
    INTERNATIONAL("Sinh vien quoc te");

    private final String description;

    private StudentType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
