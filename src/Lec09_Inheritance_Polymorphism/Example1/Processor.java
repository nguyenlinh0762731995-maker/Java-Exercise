/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec09_Inheritance_Polymorphism.Example1;

/**
 *
 * @author phuonglinh
 */
public class Processor {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.catchMouse();
        cat.makeSound();
        System.out.println("Cat's ID: " + cat.catID);
    }
}
