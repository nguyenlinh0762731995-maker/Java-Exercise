/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise;

/**
 *
 * @author phuonglinh
 */
public class Ex05_String_CheckPrefix_Suffix_Characters {

    public static void main(String[] args) {
        String s = "report_final.pdf";
        System.out.println("Starts with report: " + s.startsWith("report"));
        System.out.println("Ends with .pdf: " + s.endsWith(".pdf"));
        System.out.println("First character = " + s.charAt(0));
        System.out.println("Lasr character = " + s.charAt(s.length() - 1));
    }
}
