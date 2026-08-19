/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author phuonglinh
 */
// Calculate the area and circumference of a circle given the radius.
public class Ex06 {

    public static void main(String[] args) {
        final double PI = 3.14159;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle: ");
        double radius = sc.nextDouble();
        double area = PI * pow(radius, 2);
        double circumference = PI * 2 * radius;
        System.out.println("Area and circumferenceCircle of circle: " + area + " " + circumference);

    }
}
