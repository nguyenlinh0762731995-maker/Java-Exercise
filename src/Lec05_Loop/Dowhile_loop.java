/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec05_Loop;

import java.util.Scanner;

/**
 *
 * @author phuonglinh
 */
public class Dowhile_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phrase;
        do{
            System.out.println("Type your password: ");
            phrase = sc.next();
        }while(!phrase.equals("duytan"));
    }
}
