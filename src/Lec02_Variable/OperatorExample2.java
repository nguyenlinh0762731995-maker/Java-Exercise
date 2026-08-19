/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec02_Variable;

/**
 *
 * @author phuonglinh
 */
public class OperatorExample2 {

    public static void main(String[] args) {
        int x = 1;
        // y = 2 + 2 - 3 + 2 + 2 + 2
        int y = ++x + x++ - x + --x + 2 + x;
        System.out.print(x);
        System.out.println(y);
        x = 1;
        // y = 1 + 0 - 1 - 1 + 3 + 3 + 1
        y = x-- + x++ - x - x++ + ++x + x + 1;
        System.out.println(x + " " + y);
    }
}
