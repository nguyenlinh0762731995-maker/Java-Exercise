/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec09_Inheritance_Polymorphism.Project_Employee;

/**
 *
 * @author phuonglinh
 */
public class Employee {

    private String id;
    private String name;
    private double salary = 100000;

    Employee() {
    }

    void setID(String id) {
        this.id = id;
    }

    String getID() {
        return this.id;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return this.salary;
    }

    public void displayInfo() {
        System.out.println("Name: " + this.getName());
        System.out.println("Id: " + this.getID());
        System.out.println("Salary: " + this.getSalary());
    }

    public double calculateSalary() {
        return this.salary;
    }

}
