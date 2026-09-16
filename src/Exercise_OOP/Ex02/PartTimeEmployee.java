/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_OOP.Ex2;

/**
 *
 * @author phuonglinh
 */
public class PartTimeEmployee extends Employee {
    
    private int hoursWorked;
    private double hourlyRate;
    
    public void setHourWorked(int hourWorked) {
        this.hoursWorked = hourWorked;
    }
    
    public int getHourWorked() {
        return this.hoursWorked;
    }
    
    public double getHourlyRate() {
        return this.hourlyRate;
    }
    
    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    PartTimeEmployee(String name, String id, int hoursWorked, double hourlyRate) {
        super();
        super.setName(name);
        super.setId(id);
        this.setHourWorked(hoursWorked);
        this.setHourlyRate(hourlyRate);
    }

    @Override
    public double calculateSalary() {
        return this.getHourWorked() * this.getHourlyRate();
    }
    
    public void displayInfo() {
        System.out.println("Name: " + super.getName());
        System.out.println("Id: " + super.getId());
        System.out.println("Salary: " + this.calculateSalary());
    }
    
}
