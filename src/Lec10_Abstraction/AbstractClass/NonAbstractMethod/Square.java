/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec10_Abstraction.AbstractClass.NonAbstractMethod;

/**
 *
 * @author phuonglinh
 */
public class Square extends Shape{
    private double side;
    public Square(double side){
        this.side = side;
    }
    @Override
    public double calculateArea(){
        return this.side*this.side;
    }
    public void display(){
        System.out.println("This is a square ");
    }
}
