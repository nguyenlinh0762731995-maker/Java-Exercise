/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec06_ArrayArraylist;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author phuonglinh
 */
public class Ex_weather2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("How many day's temperatures ?: ");
        int days = sc.nextInt();
        double[] temp = new double[days];
        double tempMax1=0,tempMax2=0;
        double tempMin1 =0,tempMin2=0;
        double tmp;
        double sum=0;
        for(int i=0;i<temp.length;i++){
            System.out.print("Day " + (i+1) + "'s high temp: ");
            temp[i] = sc.nextDouble();
            sum+=temp[i];
            if(temp[i] > tempMax2){
                tempMax2 = temp[i];
            }
            if(tempMax2 > tempMax1){
                tmp = tempMax1;
                tempMax1 = tempMax2;
                tempMax2 = tmp;
            }
            if(temp[i] < tempMin2){
                tempMin1 = temp[i];
            }
            if(tempMin2 < tempMin1){
                tmp = tempMin1;
                tempMin1 = tempMin2;
                tempMin2 = tmp;
                
            }
        }
        double average = (double)sum/days;
        for(int i=0;i<temp.length;i++){
            System.out.println(Arrays.toString(temp));
        }
        System.out.println(tempMin1 + " " + tempMin2);
    }
}
