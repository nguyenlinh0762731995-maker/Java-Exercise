/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise;

import java.util.Scanner;

/**
 *
 * @author phuonglinh
 */
public class CalculateSum_Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] n = new int[count];
        int sum =0;
        for(int i=0;i<count;i++){
            n[i] =sc.nextInt();
            sum+=n[i];
        }
        System.out.print("Enter n: ");
        for(int i=0;i<count;i++){
            System.out.print("Enter element " + i + ": ");
        }
        System.out.println("Sum = " + sum);
        float average = (float) sum/count;
        System.out.printf("Average = %.1f",  average);
    }
}
