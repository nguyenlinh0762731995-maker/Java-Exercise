/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec06_ArrayArraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author phuonglinh
 */
public class Calculate_Score {

    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count of array: ");
        int count = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("n[" + i + "] : ");
            int k = sc.nextInt();
            sum += k;
            n.add(k);
        }
        System.out.println("Array: " + n);
        System.out.println("sum: " + sum);
        float average = (float) sum / count;
        System.out.println("average: " + average);
    }
}
