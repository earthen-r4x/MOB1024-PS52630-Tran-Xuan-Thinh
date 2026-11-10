package com.poly.bai2;
public class FullTimeEmployee extends Employee {
    private double bonus;
    private double penalty;
    
    public FullTimeEmployee() {
        super();
    }

    public FullTimeEmployee(String id, String name, double basicSalary, double bonus, double penalty) {
        super(id, name, basicSalary);
        this.bonus = bonus;
        this.penalty = penalty;
    }

    public double getBonus() {
        return bonus;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setBonus(double bonus) {
        if (bonus < 0) {
            System.out.println("Thuong khong duoc am");
        } else {
            this.bonus = bonus;
        }
    }

    public void setPenalty(double penalty) {
        if (penalty < 0) {
            System.out.println("Phat khong duoc am");
        } else {
            this.penalty = penalty;
        }
    }

    @Override
    public double income() {
        return super.income() + bonus - penalty;
    }
}
