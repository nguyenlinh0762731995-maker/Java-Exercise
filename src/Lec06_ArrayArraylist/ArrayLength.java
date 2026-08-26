/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec06_ArrayArraylist;

import java.util.Scanner;

/*
Nhập số ngày, nhập nhiệt độ cho từng ngày, sau đó tính trung bình
in ra những ngày có nhiệt độ trên trung bình
 */
public class ArrayLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many days temperatures ? : ");
        int days = sc.nextInt();
        int[] temps = new int[days];
        int sum = 0;
        for (int i = 0; i < temps.length; i++) {
            System.out.print("Day " + (i + 1) + " is high temp: ");
            temps[i] = sc.nextInt();
            sum += temps[i];
        }
        double average = (double) sum / days;
        int count = 0;
        for (int i = 0; i < temps.length; i++) {
            if (temps[i] > average) {
                count++;
            }
        }
        System.out.printf("Average temp = %.1f ", average);
        System.out.println();
        System.out.println(count + " days above average ");

    }
}
