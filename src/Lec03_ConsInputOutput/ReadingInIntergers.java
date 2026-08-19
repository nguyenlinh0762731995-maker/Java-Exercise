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
public class ReadingInIntergers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int number = sc.nextInt();
        System.out.print("number = " + number);
    }
}
