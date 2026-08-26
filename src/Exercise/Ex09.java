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
public class Ex09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nguyen : ");
        int n = sc.nextInt();
        if (n % 2 == 0) {
            System.out.println("So chan");

        } else {
            System.out.println("So le");
        }
    }

}
