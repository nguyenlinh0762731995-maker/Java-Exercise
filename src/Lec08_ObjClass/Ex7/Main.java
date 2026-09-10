/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec08_ObjClass.Ex7;

/**
 *
 * @author phuonglinh
 */
public class Main {

    public static void main(String[] args) {
        Book b1 = new Book("Clean Code", "Robert C. Martin", 25.0);
        Book b2 = new Book("Effective Java", "Joshua Bloch", 30.0);
        b1.displayBookInfo();
        b2.displayBookInfo();
    }
}
