/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec08_ObjClass.Homework_Ex15;

import java.util.Scanner;

/**
 *
 * @author phuonglinh
 */
public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount b1 = new BankAccount();
        b1.addInfo();
        System.out.println("Enter amount (to deposite): ");
        int amount = sc.nextInt();
        b1.deposite(amount);
        System.out.println("Balance after deposited: " + b1.getBalance());
        System.out.println("Enter amount (to withdraw): ");
        amount = sc.nextInt();
        b1.withdraw(amount);
        System.out.println("Balance after withdrawed: " + b1.getBalance());

    }

}
