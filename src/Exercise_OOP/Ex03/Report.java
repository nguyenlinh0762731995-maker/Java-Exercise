/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercise_OOP.Ex03;

/**
 *
 * @author phuonglinh
 */
public class Report implements IPrintable {

    String title = "Technolygy";

    @Override
    public void print() {
        System.out.println("the title is " + this.title);
    }

}
