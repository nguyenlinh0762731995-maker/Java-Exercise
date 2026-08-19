/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec03_ConsInputOutput;
import java.util.Scanner;
/**
 *
 * @author phuonglinh
 */
public class ReadingInDoubles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a double: ");
        double x = sc.nextDouble();
        // phải nhập số thực là 4,5
        System.out.printf("%.4f",x);
    }
}
