/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec04_Condition;

import java.util.Scanner;

/**
 *
 * @author phuonglinh
 */
public class QuaratEx {

    public static int quadrant(int x, int y) {
        if (x > 0) {
            if (y > 0) {
                return 1;
            } else {
                return 4;
            }
        } else {
            if (y > 0) {
                return 2;
            } else {
                return 3;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = sc.nextInt();
        System.out.print("Enter y: ");
        int y = sc.nextInt();
        int res = quadrant(x, y);
        System.out.println("Goc phan tu thu " + res);
    }
}
