/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec07_String;

/**
 *
 * @author phuonglinh
 */
public class trim_ {
    public static void main(String[] args) {
        String s = "   Sachin    ";
        System.out.println("("+ s + ")");//   Sachin    .
        System.out.println("(" + s.trim() + ")");//Sachin
    }
}
