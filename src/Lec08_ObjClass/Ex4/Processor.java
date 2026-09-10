/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec08_ObjClass.Ex4;

/**
 *
 * @author phuonglinh
 */
public class Processor {
    public static void main(String[] args) {
        // studentid , full name , major
        Student st1 = new Student("S001","An Nguyen","IT");
        Student st2 = new Student("S002","Binh Tran","SE");
        Student st3 = new Student();
        System.out.println("Enter information of student 3th: ");
        st3.enterInfo();
        st1.displayInfo();
        st2.displayInfo();
        st3.displayInfo();
    }
}
