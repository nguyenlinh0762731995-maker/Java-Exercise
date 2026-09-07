/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lec07_String;

/**
 *
 * @author phuonglinh
 */
public class StringLiteral_NewKeyWord {
    public static void main(String[] args) {
        String a = "abc";
        String b = "abc";
        // stackMemory (a->reference) heapMemory("abc")(trong heapMemory có chứa String constant pool sẽ luu "abc"_> check xem b có "abc" co trong memory chua )
        System.out.println(a==b);// nó đang so sánh địa chỉ thì cùng ô nhớ là "abc" ->true
        String c ="dce";
        System.out.println(c==b);// nó đang so snahs địa chỉ vì không cùng ô nhớ nên -> false
        String h = new String("abc");
        System.out.println(a==h);// trả về false vì ô nhớ khác nhau / của h là ở trong heap còn của a thì ở trong String constant pool
        // == thì nó chỉ so sánh trong stack
        // equal thì nó so sánh trong heap
        System.out.println(a.equals(h));// true
    }
}
