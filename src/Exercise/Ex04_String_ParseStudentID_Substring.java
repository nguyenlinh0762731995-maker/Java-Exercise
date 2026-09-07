/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise;

/**
 *
 * @author phuonglinh
 */
public class Ex04_String_ParseStudentID_Substring {

    public static void main(String[] args) {
        String s = "SE123456";
        System.out.println("for example: " + s);
        System.out.println("Major code = " + s.substring(0, 2));
        System.out.println("Numeric part = " + s.substring(2, s.length() - 1));

    }
}
