/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec08_ObjClass.Ex8;

/**
 *
 * @author phuonglinh
 */
public class CircleShape {

    private double radius;

    CircleShape(double radius) {
        this.radius = radius;
    }

    public void display() {
        System.out.println("Radius of circle shape: " + this.radius);
    }

    public double calculateArea() {
        System.out.print("Area of circle shape: ");
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double calculateCircumference() {
        System.out.print("Circumference of circle shape: ");
        return Math.PI * 2 * this.radius;

    }
}
