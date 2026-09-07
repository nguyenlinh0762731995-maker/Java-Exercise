/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise;

/**
 *
 * @author phuonglinh
 */
public class Ex10_String_CensorWord {

    public static void main(String[] args) {
        String s = "this offer is spam and definitely spam";
        String k = "spam";
        System.out.println("Original : " + s);
        System.out.println("Censored: " + s.replaceAll(k, "****"));
    }
}
