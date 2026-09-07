/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec07_String;

/**
 *
 * @author phuonglinh
 */
public class Substring {
    public static void main(String[] args) {
        // 0H1e2l3l405 6W7o8r9d
        String s = "Hello World";
        System.out.println(s.substring(6));//World (tu vi tri 6 den het)
        System.out.println(s.substring(0, 5));// Hello ( tu vi tri 0 đem trc vi tri 5)
        System.out.println(s.substring(1, 3));// el ( tu vi tri 1 đến trước vị trí 3
    }
}
