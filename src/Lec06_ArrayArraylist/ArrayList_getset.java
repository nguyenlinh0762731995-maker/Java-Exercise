/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec06_ArrayArraylist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author phuonglinh
 */
public class ArrayList_getset {
    public static void main(String[] args) {
        ArrayList<Integer> score = new ArrayList<>(Arrays.asList(7,8,6,9,5));
        System.out.println("score[2] = " + score.get(2));
        score.set(2,10);
        System.out.println("Updated scores = "+ score);
    }
}
