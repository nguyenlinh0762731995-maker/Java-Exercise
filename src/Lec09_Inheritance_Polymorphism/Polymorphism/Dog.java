/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec09_Inheritance_Polymorphism.Polymorphism;

/**
 *
 * @author phuonglinh
 */
public class Dog extends Animal {

    int a = 3;

    @Override
    void makeSound() {
        System.out.println("Gauw Gauw");
    }

}
