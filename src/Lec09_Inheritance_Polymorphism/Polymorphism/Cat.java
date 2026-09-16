/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec09_Inheritance_Polymorphism.Polymorphism;

/**
 *
 * @author phuonglinh
 */
public class Cat extends Animal {

    int a = 2;

    @Override
    void makeSound() {
        System.out.println("Meow Meow");
    }

}
