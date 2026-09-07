/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec07_String;

/**
 *
 * @author phuonglinh
 */
public class Intern_method {

    public static void main(String[] args) {
        String str1 = new String("Hello Java");
        String str2 = "Hello Java";
        String str3 = str2.intern();// sao chep địa chỉ và giá trị
        System.out.println("str1 == str2 " + (str1 == str2));
        System.out.println("str1 == str3 " + (str1 == str3));
        System.out.println("str2 == str3 " + (str2 == str3));
    }
}
