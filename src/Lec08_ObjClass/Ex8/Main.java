/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec08_ObjClass.Ex8;

/**
 *
 * @author phuonglinh
 */
public class Main {

    public static void main(String[] args) {
        CircleShape c1 = new CircleShape(4.0);
        c1.display();
        System.out.println(c1.calculateArea());
        System.out.println(c1.calculateCircumference());
    }
}
