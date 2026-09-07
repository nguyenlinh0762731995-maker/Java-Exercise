/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise;

/**
 *
 * @author phuonglinh
 */
public class Ex03_String_StringConcatenationandImmutability {
    public static void main(String[] args) {
        String s="Duy Tan";
        String b = s+" University";
        System.out.println("Using +: " + b);
        String c = s.concat(" Universty");
        System.out.println("Using concat: " + c);
        System.out.println("First after concat without reassingment: " + s);
        
    }
}
