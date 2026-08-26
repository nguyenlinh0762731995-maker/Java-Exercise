/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec06_ArrayArraylist;

import java.util.Arrays;
public class ArraytoStrng {
    public static void main(String[] args) {
        int[] e = {0,2,4,6,8};
        System.out.println("e is " + Arrays.toString(e));
        System.out.print("e is [");
        for(int i=0;i<e.length;i++){
            if(i == e.length-1){
                System.out.print(e[i]);
            }
            else {System.out.print(e[i] + ", ");}
        }
        System.out.print("]");
    }
}


