/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_OOP.Ex9;

/**
 *
 * @author phuonglinh
 */
public class Processor {

    public static void main(String[] args) {

        Account account = new SavingAccount(500000);
        account.display();
        System.out.println(account.getAccountType());
    }

}
