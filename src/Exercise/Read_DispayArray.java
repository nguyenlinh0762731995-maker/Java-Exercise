/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author phuonglinh
 */
public class Read_DispayArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] n = new int[count];
        for(int i=0;i<count;i++){
            n[i] = sc.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(n));
    }
}
