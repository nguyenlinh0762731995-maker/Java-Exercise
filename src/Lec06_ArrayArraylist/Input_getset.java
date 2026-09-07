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
public class Input_getset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> n = new ArrayList<>();
        System.out.print("Enter count of array: ");
        int count = sc.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.print("n[" + i+ "] : ");
            int k = sc.nextInt();
            n.add(k);
        }
        System.out.println("Before replace: "+ n);
        System.out.println("n[2]: " + n.get(2));
        System.out.println("You choose index to show value: ");
        int l = sc.nextInt();
        System.out.println("Enter a value (wanna replace): ");
        int o = sc.nextInt();
        n.set(l, o);
        System.out.println("After replaced: "+ n);
    }
}
