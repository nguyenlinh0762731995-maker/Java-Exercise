/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise;

import java.util.Scanner;

/*
nhap n dung (if/else if/else): kiem tra la so duong, am hoac bang khong
 */
public class Ex08 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("So nguyen duong");
        } else if (n == 0) {
            System.out.println("Bang 0");
        } else {
            System.out.println("So nguyen am");
        }
    }
}

