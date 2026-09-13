/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec08_ObjClass.Homework_Ex18;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author phuonglinh
 */
public class Student {

    private String id;
    private String name;
    private ArrayList<Double> grades;

    public Student() {
        this.grades = new ArrayList<Double>();
    }

    public void addGrade(double grade) {
        if (grade <= 10 && grade >= 0) {
            grades.add(grade);
        }
    }

    public ArrayList<Double> getAverage() {
        return grades;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Id: " + this.id);
        System.out.println("Grades: " + getAverage());
    }

    public void addInfor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.print("Enter id: ");
        this.id = sc.nextLine();
        while (true) {

            System.out.print("Enter grade: ");
            int grade = sc.nextInt();
            if (grade > 10 || grade < 0) {
                System.out.println("You entered grade invalid_");
            }
            addGrade(grade);
            System.out.println("Grade added successfully!");
            System.out.println("Do you want to continue entering grades?(y/n):  ");
            char a = sc.next().charAt(0);
            if (a == 'y') {
                continue;
            } else {
                break;
            }
        }
    }
}
