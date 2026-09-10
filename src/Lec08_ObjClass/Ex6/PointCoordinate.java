/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec08_ObjClass.Ex6;

import java.util.Scanner;

/**
 *
 * @author phuonglinh
 */
public class PointCoordinate {

    private double x;
    private double y;

    public void enterInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        this.x = sc.nextDouble();
        System.out.print("Enter y: ");
        this.y = sc.nextDouble();

    }

    public double distanceFromOrigin() {
        System.out.print("distance from origin: ");
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    PointCoordinate(double x, double y) {
        this.x = x;
        this.y = y;
    }

    PointCoordinate() {
    }
}
