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
public class Ex12 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Enter n (numebr) to sum (to 1 from n): ");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
            if(i == n){
                System.out.print(i + " = ");
            }
            else {System.out.print(i  + " + ");}
        }
        System.out.println(sum);
        
    }
}
