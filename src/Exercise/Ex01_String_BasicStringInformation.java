/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise;

import java.util.Scanner;

/**
 *
 * @author phuonglinh
 */
public class Ex01_String_BasicStringInformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Original: ");
        String s = sc.nextLine();
        int lengthOriginal = s.length();
        System.out.println("Trimmed: [" + s.trim() + "]" );
        System.out.println("Upper: " + s.toUpperCase());
        System.out.println("Lower: " + s.toLowerCase());
        System.out.println("Original length = " + lengthOriginal );
        System.out.println("Length after trim = " + (s.trim()).length());
    }
}
