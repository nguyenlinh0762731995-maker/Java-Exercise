/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec08_ObjClass.Ex1;

/**
 *
 * @author phuonglinh
 */
public class Processor {

    public static void main(String[] args) {
        Car car = new Car();// khong cần constructor nó cũng tự tạo obj
//        Car myCar = new Car("Lamborghini",2020);
        car.displayDetails();
    }
}
