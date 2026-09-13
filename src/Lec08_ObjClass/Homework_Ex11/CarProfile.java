/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec08_ObjClass.Homework_Ex11;

import java.util.Scanner;

/**
 *
 * @author phuonglinh
 */
public class CarProfile {

    private String make;
    private String model;
    private int year;

    public CarProfile() {
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getMake() {
        return this.make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return this.model;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return this.year;
    }

    public void addProfile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter make: ");
        setMake(sc.nextLine());
        System.out.println("Enter model: ");
        setModel(sc.nextLine());
        System.out.println("Enter year: ");
        int year1 = sc.nextInt();
        while (year1 < 0 || year1 > 2026) {
            System.out.print("Enter year again: ");
            year1 = sc.nextInt();
        }
        setYear(sc.nextInt());
    }

    public void displayProfile() {
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Year: " + this.year);
    }
}
