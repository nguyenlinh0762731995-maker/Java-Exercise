/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec03_ConsInputOutput;

import java.util.Scanner;

/**
 *
 * @author phuonglinh
 */
public class RectangleExercise {
    public static double areaRectangle(double a, double b) {
        return a*b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of the rectangle: ");
        double length = sc.nextDouble();
        System.out.println("Enter width of the rectangle: ");
        double width = sc.nextDouble();
        double area = areaRectangle(length, width);
        System.out.print("Area of the rectangle: " );
        System.out.printf("%.4f", area);
        
    }
}
