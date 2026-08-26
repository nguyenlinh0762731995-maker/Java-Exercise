/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec05_Loop;

import java.util.Scanner;

/**
 *
 * @author phuonglinh
 */
public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number (0 to quit): ");
        int sum =0;
        int number = sc.nextInt();
        while(number != 0){
            sum +=number;
            System.out.print("Enter the number (0 to quit): ");
            number = sc.nextInt();
        }
        System.out.println("The sum is " + sum);
        
    }
}
