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
public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n to print (to 1 from n): ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print(i + " ");
        }
    }
}
