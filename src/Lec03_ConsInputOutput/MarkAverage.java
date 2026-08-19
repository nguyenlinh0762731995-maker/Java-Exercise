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
public class MarkAverage {
    public static double averageScore(double a, double b, double c) {
        return (a+b+c)/3;    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter english score: ");
        double english = sc.nextDouble();
        System.out.println("Enter coding score: ");
        double coding = sc.nextDouble();
        System.out.println("Enter math score: ");
        double math = sc.nextDouble();
        double average= averageScore(english, math,coding);
        System.out.println("Average of 3 subjects: " + average);
    }
}
