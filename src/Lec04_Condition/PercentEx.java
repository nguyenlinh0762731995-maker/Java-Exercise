/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec04_Condition;

import java.util.Scanner;

/**
 *
 * @author phuonglinh
 */
public class PercentEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter percentage earn: ");
        int percent = sc.nextInt();
        System.out.println("You can choose 2 ways: \n1. Method 1 for if\n2. Method 2 for elseif ");
        int choose = sc.nextInt();
        if (choose == 1) {
            if (percent >= 90) {
                System.out.println("A");
            }
            if (percent < 90 && percent >= 80) {
                System.out.println("B");
            }
            if (percent < 80 && percent >= 70) {
                System.out.println("C");
            }
            if (percent < 70 && percent >= 60) {
                System.out.println("D");
            }
            if (percent < 60) {
                System.out.println("F");

            }
        } else {
            if (percent >= 90) {
                System.out.println("A");
            } else if (percent >= 80) {
                System.out.println("B");
            } else if (percent >= 70) {
                System.out.println("C");
            } else if (percent >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }

    }
}
