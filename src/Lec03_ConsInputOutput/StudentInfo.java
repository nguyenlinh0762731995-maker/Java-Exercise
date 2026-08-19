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
public class StudentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter full name: ");
        String fullname = sc.nextLine();
        System.out.print("Enter gpa:  ");
        int gpa = sc.nextInt();
        System.out.print("Enter major: ");
        String major = sc.nextLine();
        System.out.print("Enter hometown: ");
        String hometown = sc.nextLine();
        System.out.println("Full name: " + fullname + "\nGpa: " + gpa + "\nMajor: " + major + "\nHometown: " + hometown );
        
    }
    
}
