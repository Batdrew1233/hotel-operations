package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getRegularHours(){
        if (hoursWorked > 40){
            return 40;
        }
        return hoursWorked;
    }
    public double getOverTimeHours(){
        if (hoursWorked > 40){
            return hoursWorked - 40;
        }
        return 0;
    }
    public double getTotalPay(){
        double regularPay = payRate * getRegularHours();
        double overTimePay = getOverTimeHours() * 1.5;
        return regularPay + overTimePay;
    }
}
