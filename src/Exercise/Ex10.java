/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise;

import java.util.Scanner;

/*
kiem tra dat/ khong dat: nhap diem tong ket neu 5 tro len thì "Dat" , nguoc lai "Khong dạt"
 */
public class Ex10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so diem tong ket: ");
        double score = sc.nextDouble();
        if (score >= 5) {
            System.out.println("Dat");
        } else {
            System.out.println("Khong dat");
        }
    }
}
