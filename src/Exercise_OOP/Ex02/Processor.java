/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_OOP.Ex2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author phuonglinh
 */
public class Processor {

    public static void addEmployee(ArrayList<Employee> employee) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("The role of employee: ");
            System.out.println("1. Full time employee ");
            System.out.println("2. Part time employee ");
            System.out.println("3. Exit");
            int choose = sc.nextInt();
            System.out.println("Please enter the full information below: ");
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Id: ");
            sc.nextLine();
            String id = sc.nextLine();
            if (choose == 1) {
                System.out.println("Salary: ");
                double salary = sc.nextDouble();
                System.out.println("Bonus: ");
                double bonus = sc.nextDouble();
                employee.add(new FullTimeEmployee(name, id, salary, bonus));
                System.out.println("Information has been added to the list ");
                continue;
            } else if (choose == 2) {
                System.out.println("Hours Worked: ");
                int hoursWorked = sc.nextInt();
                System.out.println("Hours Rate: ");
                double hoursRate = sc.nextDouble();
                employee.add(new PartTimeEmployee(name, id, hoursWorked, hoursRate));
                System.out.println("Information has been added to the list");
                continue;
            } else if (choose == 3) {
                System.out.println("You have exitted _ADD EMPLOYEE_ ");
                return;
            } else {
                System.out.println("You entered it incorrectly! \nPlease enter it again:  ");
            }

        }
    }

    public static void displayEmployee(ArrayList<Employee> employee) {
        int i = 1;
        for (Employee e : employee) {
            System.out.println("======= Employe " + i + " ============");
            e.displayInfo();
            i++;
        }
    }

    public static void findEmployee(ArrayList<Employee> employee) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id to find: ");
        String id = sc.nextLine();
        boolean key = false;
        for (Employee e : employee) {
            if (e.getId().equals(id)) {
                System.out.println("=========== The employee information you are looking ========= ");
                e.displayInfo();
                key = true;
            }
        }
        if (key == false) {
            System.out.println("No information found for the employee you are looking");
        }
    }

    public static void calculateTotalSalary(ArrayList<Employee> employee) {
        double sum = 0;
        for (Employee e : employee) {
            sum += e.calculateSalary();
        }
        System.out.println("The total salary of all employees : " + sum);
    }

    public static void menu(ArrayList<Employee> employee) {

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("====== Manage employee =======");
            System.out.println("1. Add information of new employee ");
            System.out.println("2. Display all information of employee");
            System.out.println("3. Find information of employ (id)");
            System.out.println("4. Total salary of all employee ");
            int choose = sc.nextInt();
            switch (choose) {
                case 1:
                    Processor.addEmployee(employee);
                    break;
                case 2:
                    Processor.displayEmployee(employee);
                    break;
                case 3:
                    Processor.findEmployee(employee);
                    break;
                case 4:
                    Processor.calculateTotalSalary(employee);
                    break;
                default:
                    System.out.println("Invalid!\nYou can enter again :");
                    continue;
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> employee = new ArrayList<>();
        Processor.menu(employee);

    }

}
