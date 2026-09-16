/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec10_Abstraction.Interface.Multiple;

/**
 *
 * @author phuonglinh
 */
public class Circle implements IColor, IShape {

    @Override
    public void fillColor() {
        System.out.println("Filling the circle with pink ");
    }

    public void drawShape() {
        System.out.println("Drawing a circle ");
    }

}
