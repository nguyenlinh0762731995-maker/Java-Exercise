/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec09_Inheritance_Polymorphism.Polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author phuonglinh
 */
public class Processor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cach xu ly: \n1. Array co dinh\n2. ArrayList");
        int choose = sc.nextInt();
        if (choose == 1) {
            Animal[] animals = new Animal[5];
            animals[0] = new Cat();
            animals[1] = new Cat();
            animals[2] = new Dog();
            animals[3] = new Cat();
            animals[4] = new Dog();
            int dogCount = 0;
            int catCount = 0;
            for (int i = 0; i < animals.length; i++) {
                if (animals[i] instanceof Cat) {
                    catCount++;
                } else if (animals[i] instanceof Dog) {
                    dogCount++;
                }
            }
            System.out.println("Dog: " + dogCount);
            System.out.println("Cat: " + catCount);
        } else if (choose == 2) {
            ArrayList<Animal> animals = new ArrayList<>();
            animals.add(new Cat());
            animals.add(new Dog());
            animals.add(new Cat());
            int catCount = 0;
            int dogCount = 0;
            for (Animal animal : animals) {
                if (animal instanceof Cat) {
                    catCount++;
                } else if (animal instanceof Dog) {
                    dogCount++;
                }
            }
            System.out.println("Dog : " + dogCount);
            System.out.println("Cat: " + catCount);
        }
        Animal cat = new Cat();
        System.out.println("a cua cat" + cat.a);
        Animal dog = new Dog();
        System.out.println("a cua dog" + dog.a);

    }
}
