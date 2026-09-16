/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_OOP.Ex2;

/**
 *
 * @author phuonglinh
 */
public class FullTimeEmployee extends Employee {
    
    private double bonus;
    
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public double getBonus() {
        return this.bonus;
    }

    FullTimeEmployee(String name, String id, double salary, double bonus) {
        super();
        super.setName(name);
        super.setId(id);
        super.setSalary(salary);
        this.setBonus(bonus);
    }

    @Override
    public double calculateSalary() {
        return super.getSalary() + this.getBonus();
    }
    
    public void displayInfo() {
        System.out.println("Id: " + super.getId());
        System.out.println("Name: " + super.getName());
        System.out.println("Salary: " + super.getSalary());
        System.out.println("Real salary: " + this.calculateSalary());
    }
    
}
