/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec01_Introduction;

/**
 *
 * @author Administrator
 */
public class MethodExample {

    public static void main(String[] args) {
        message1();
        message2();
        System.out.println("Done with main.");
    }

    public static void message1() {
        System.out.println("This is message 1.");
    }

    public static void message2() {
        System.out.println("This is message 2.");
        message1();
        System.out.println("Done with message 2.");
    }

}
