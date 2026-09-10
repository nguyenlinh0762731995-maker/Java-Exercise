/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec08_ObjClass.Ex3;

/**
 *
 * @author phuonglinh
 */
public class Student {

    int id;
    String name;

    void display() {
        System.out.println(id + " " + name);
    }

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
