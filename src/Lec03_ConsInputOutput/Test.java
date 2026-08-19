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
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter full name: ");
        String fullname = sc.nextLine();
        System.out.println("Enter gpa: ");
        int gpa = sc.nextInt();
        System.out.println("Full name: " + fullname + "\nGpa: " + gpa);
    }
}
