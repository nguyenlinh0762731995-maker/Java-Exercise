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
//Convert the total number of seconds into hours, minutes, and seconds.
public class Ex07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total number of seconds: ");
        int seconds = sc.nextInt();
        int hours = seconds/3600;
        int minutes = (seconds - hours * 3600) / 60;
        int seconds2 = (seconds - hours * 3600 - minutes * 60);
        System.out.println("the total seconds: " + seconds + "\n" + hours + " hour " + minutes + " minutes " + seconds2  + " seconds ");
        
    }
}
