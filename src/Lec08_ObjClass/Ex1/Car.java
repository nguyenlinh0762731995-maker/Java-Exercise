/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec08_ObjClass.Ex1;

/**
 *
 * @author phuonglinh
 */
public class Car {

    private String name;
    private int year;

//    public Car(String name, int year) {
//        this.name = name;
//        this.year = year;
//    }

    void displayDetails() {
        System.out.println("Car Model: " + this.name);
        System.out.println("Year: " + this.year);
    }
}
