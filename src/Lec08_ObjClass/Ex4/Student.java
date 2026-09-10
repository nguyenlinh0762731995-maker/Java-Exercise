/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec08_ObjClass.Ex4;

import java.util.Scanner;

/**
 *
 * @author phuonglinh
 */
public class Student {

    private String studentID;
    private String fullName;
    private String major;

    Student(String studentID, String fullName, String major) {
        this.fullName = fullName;
        this.major = major;
        this.studentID = studentID;
    }

    Student() {
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getStudentID() {
        return this.studentID;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getMajor() {
        return this.major;
    }

    public void enterInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full name: ");
        this.fullName = sc.nextLine();
        System.out.print("Enter student ID: ");
        this.studentID = sc.nextLine();
        System.out.print("Enter major: ");
        this.major = sc.nextLine();
    }

    public void displayInfo() {
        System.out.print(this.fullName);
        System.out.print("\t" + this.studentID);
        System.out.println("\t" + this.major);
    }
}
