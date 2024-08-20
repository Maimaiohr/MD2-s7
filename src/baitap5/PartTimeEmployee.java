package baitap5;

import java.util.Scanner;

public class PartTimeEmployee extends Employee {
    int workingHours;

    public PartTimeEmployee() {
    }

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return workingHours * super.getPaymentPerHour();
    }

    @Override
    public String getNamee() {
        System.out.println("ten NV la:"+this.name);
        return "";
    }
}
