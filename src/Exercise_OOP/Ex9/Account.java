/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_OOP.Ex9;

/**
 *
 * @author phuonglinh
 */
public abstract class Account {

    protected double balance;

    Account(double balance) {
        this.balance = balance;
    }

    public abstract String getAccountType();

    void display() {
        System.out.println("balance: " + this.balance);
    }

}
