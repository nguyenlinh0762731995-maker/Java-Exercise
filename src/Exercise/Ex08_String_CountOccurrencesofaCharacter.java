/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise;

/**
 *
 * @author phuonglinh
 */
public class Ex08_String_CountOccurrencesofaCharacter {

    public static void main(String[] args) {
        String s = "programming";
        char n = 'm';
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == n) {
                count++;
            }
        }
        System.out.println("Occurrences of 'm' in " + s + " : " + count);
    }
}
