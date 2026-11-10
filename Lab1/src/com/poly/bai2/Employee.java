package com.poly.bai2;
public class Employee {
    private String id;
    private String name;
    private double basicSalary;

    public Employee() {
    }

    public Employee(String id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setId(String id) {
        if (id.isEmpty()) {
            System.out.println("ID khong duoc de trong");
        } else {
            this.id = id;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBasicSalary(double basicSalary) {
        if (basicSalary <= 0) {
            System.out.println("Luong co ban phai lon hon 0");
        } else {
            this.basicSalary = basicSalary;
        }
    }

    public double income() {
        return basicSalary;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Employee{");
        sb.append("id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", basicSalary=").append(basicSalary);
        sb.append('}');
        return sb.toString();
    }



}