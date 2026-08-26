/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec06_ArrayArraylist;

/**
 *
 * @author phuonglinh
 */
public class Accessing_elements {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        numbers[0] = 27;
        numbers[3] = -6;
        System.out.println(numbers[0]);
        if(numbers[3] <0){
            System.out.println("Elemet 3 is negative. ");
        }
    }
}
