/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec09_Inheritance_Polymorphism.Super.InstanceVariable;

/**
 *
 * @author phuonglinh
 */
public class Husky extends Dog {

    int price = 1500;

    Husky() {
        super();
        System.out.println("Husky constructor");
    }

    void display() {
        System.out.println("Dog's price: " + super.price);
        System.out.println("Husky's price: " + this.price);
    }

}
