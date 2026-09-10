/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec08_ObjClass.Ex7;

/**
 *
 * @author phuonglinh
 */
public class Book {

    private String title;
    private String author;
    private double price;

    Book(String title, String author, double price) {
        this.author = author;
        this.price = price;
        this.title = title;
    }

    public void displayBookInfo() {
        System.out.print("Title: " + this.title);
        System.out.print("\t\tAuthor: " + this.author);
        System.out.println("\t\tPrice: " + this.price);
    }
}
