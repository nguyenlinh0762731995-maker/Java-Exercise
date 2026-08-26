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
public class Correct_sentinelcode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.print("Enter the number (-1 to quit): ");
        int number = sc.nextInt();
        while(number != -1){
            sum+=number;
            System.out.print("Enter the number (-1 to quit): ");
            number = sc.nextInt();
        }
        System.out.println("The total is " +  sum);
    }
}
