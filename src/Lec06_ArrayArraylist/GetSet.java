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
public class GetSet {
    public static void main(String[] args) {
        ArrayList<Integer> n = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,89));
        System.out.println("Score[2] ="+ n.get(2));
        n.set(2,10);
        System.out.println("Update scores = "+ n);
    }
}
