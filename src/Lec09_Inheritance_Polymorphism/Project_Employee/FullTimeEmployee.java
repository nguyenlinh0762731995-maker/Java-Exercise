/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec09_Inheritance_Polymorphism.Project_Employee;

/**
 *
 * @author phuonglinh
 */
public class FullTimeEmployee extends Employee {

    private double bonus = 1000;

    double getBonus() {
        return this.bonus;
    }

    @Override
    public double calculateSalary() {
        double salary = super.calculateSalary();
        return this.getBonus() * salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + super.getName());
        System.out.println("Id: " + super.getID());
        System.out.println("Salary: " + this.calculateSalary());
    }

}
