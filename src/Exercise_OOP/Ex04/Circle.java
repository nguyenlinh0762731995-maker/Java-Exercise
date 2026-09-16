/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_OOP.Ex04;

/**
 *
 * @author phuonglinh
 */
public class Circle implements IColorable, IDrawable {

    @Override
    public void draw() {
        System.out.println("Drawing !!!");
    }

    public void fillColor() {
        System.out.println("Filling color with pink !!!");
    }

}
