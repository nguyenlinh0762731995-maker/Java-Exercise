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
public class CtoF {
    public static double ctoF(int a) {
        return a * 9.0 / 5 + 32;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter celcius: ");
        int c = sc.nextInt();
        double f = ctoF(c);
        System.out.println("Result c to f: " + f);
    }
}
