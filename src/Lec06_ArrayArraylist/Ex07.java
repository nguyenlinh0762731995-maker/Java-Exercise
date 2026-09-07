/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec06_ArrayArraylist;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author phuonglinh
 */
public class Ex07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>(Arrays.asList(5, 3, 9, 7, 2));
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 0; i < array.size(); i++) {
            if (n == array.get(i)) {
                System.out.println("index =" + i);
               
            }

        }
    }
}
