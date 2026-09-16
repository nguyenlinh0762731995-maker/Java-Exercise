/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_OOP.Ex9;

/**
 *
 * @author phuonglinh
 */
public class SavingAccount extends Account {

    SavingAccount(double balance) {
        super(balance);
    }

    @Override
    public String getAccountType() {
        System.out.println("getted account type !!!");
        return "getted ! ";
    }

}
