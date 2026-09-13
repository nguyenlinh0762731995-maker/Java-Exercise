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
public class BankAccount {

    private String accountNumber;
    private String owner;
    private int balance;

    public BankAccount() {
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public void deposite(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public void display() {
        System.out.println("Owner: " + this.owner);
        System.out.println("AccountNumber: " + this.accountNumber);
        System.out.println("Balance+ " + this.balance);
    }

    public void addInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter owner: ");
        setOwner(sc.nextLine());
        System.out.println("Enter accountNumber: ");
        setAccountNumber(sc.nextLine());
        System.out.println("Enter balance: ");
        setBalance(sc.nextInt());

    }

}
