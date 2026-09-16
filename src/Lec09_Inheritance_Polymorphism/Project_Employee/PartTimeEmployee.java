/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec09_Inheritance_Polymorphism.Project_Employee;

/**
 *
 * @author phuonglinh
 */
public class PartTimeEmployee extends Employee {

    private int hoursWorked = 50;
    private int hourlyRate = 10;

    int getHoursWorked() {
        return this.hoursWorked;
    }

    int getHourlyRate() {
        return this.hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return this.getHourlyRate() * this.getHoursWorked();
    }

    public void displayInfo() {
        System.out.println("Name: " + super.getName());
        System.out.println("Id: " + super.getID());
        System.out.println("Salary: " + this.calculateSalary());
    }
    

}
