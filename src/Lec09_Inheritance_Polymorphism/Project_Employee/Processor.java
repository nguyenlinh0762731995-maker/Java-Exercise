/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec09_Inheritance_Polymorphism.Project_Employee;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author phuonglinh
 */
public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee());
        for (Employee employee : employees) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            employee.setName(name);
            System.out.print("Enter id: ");
            String id = sc.nextLine();
            employee.setID(id);
            System.out.print("Enter salary: ");
            int salary = sc.nextInt();
            employee.setSalary(salary);
            employee.displayInfo();

        }

    }
}
