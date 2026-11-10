package com.poly.bai2;
public class PartTimeEmployee extends Employee {
    private double workingHours;
    private double hourlyRate;

    public PartTimeEmployee() {
        super();
    }

    public PartTimeEmployee(String id, String name, double basicSalary, double workingHours, double hourlyRate) {
        super(id, name, basicSalary);
        this.workingHours = workingHours;
        this.hourlyRate = hourlyRate;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setWorkingHours(double workingHours) {
        if (workingHours < 0) {
            System.out.println("So gio lam viec khong duoc am");
        } else {
            this.workingHours = workingHours;
        }
    }

    public void setHourlyRate(double hourlyRate) {
        if (hourlyRate < 0) {
            System.out.println("Muc luong theo gio khong duoc am");
        } else {
            this.hourlyRate = hourlyRate;
        }
    }

    @Override
    public double income() {
        return super.income() + workingHours * hourlyRate;
    }
    
}
