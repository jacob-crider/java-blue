package com.techelevator;

public class Employee {

    // Instance Variables
    private int employeeId;
    private String firstName;
    private String lastName;
    private String department;
    private double annualSalary;

    // Constructor
    public Employee(int employeeId, String firstName, String lastName, double salary) {
        this.employeeId = employeeId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.annualSalary = salary;
    }
    // Methods
    public void raiseSalary(double percent) {
       if (percent > 0.0) {
           annualSalary = annualSalary * (1.0 + (percent / 100));
       }
    }

    // Getters
    public int getEmployeeId() {
        return employeeId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return lastName + ", " + firstName;
    }

    public String getDepartment() {
        return department;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    // Setters
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
