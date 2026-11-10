package com.poly.bai2;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("E001", "Nhan vien 1", 4000.0));
        employees.add(new FullTimeEmployee("E002", "Nhan vien 2", 5000.0, 1000.0, 200.0));
        employees.add(new FullTimeEmployee("E003", "Nhan vien 3", 6000.0, 500.0, 100.0));
        employees.add(new PartTimeEmployee("E004", "Nhan vien 4", 3000.0, 20.0, 50.0));
        employees.add(new PartTimeEmployee("E005", "Nhan vien 5", 3500.0, 15.0, 60.0));

        // Print
        for (Employee e : employees) {
            System.out.println(e.toString() + ", income=" + e.income());
        }

        // Highest income
        Employee highestIncomeEmployee = employees.get(0);
        for (Employee e : employees) {
            if (e.income() > highestIncomeEmployee.income()) {
                highestIncomeEmployee = e;
            }
        }
        System.out.println("Nhan vien co thu nhap cao nhat: " + highestIncomeEmployee.toString() + ", income=" + highestIncomeEmployee.income());

    }
}
