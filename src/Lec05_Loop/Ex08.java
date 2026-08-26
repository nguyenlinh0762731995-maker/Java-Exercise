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
public class Ex08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int number =0;
        do{
            System.out.print("Enter the number (0 to quit) : ");
            number = sc.nextInt();
            if(number != -0){
            sum+=number;}
        }while(number!=0);
        System.out.println("the sum is " + sum);
    }
}
