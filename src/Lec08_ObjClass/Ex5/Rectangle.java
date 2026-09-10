/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec08_ObjClass.Ex5;

import java.util.Scanner;

/**
 *
 * @author phuonglinh
 */
public class Rectangle {

    private double length;
    private double width;

    Rectangle(double leghth, double width) {
        this.length = length;
        this.width = width;
    }

    Rectangle() {
    }

    public void enterInf() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        this.length = sc.nextDouble();
        System.out.print("Enter width: ");
        this.width = sc.nextDouble();
    }

    public void display() {
        System.out.println("Length: " + this.length);
        System.out.println("Width: " + this.width);
    }

    public double getArea() {
        System.out.print("Area of rectangle: ");
        return this.length * this.width;
    }

    public double getPerimeter() {
        System.out.print("Perimeter of rectangle: ");
        return 2 * (this.length + this.width);
    }
}
