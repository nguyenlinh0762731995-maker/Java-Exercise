package Exercise;
import java.util.Scanner;
// nhap 3 canh cua 1 tam giac, nếu tổng 2 cạnh lớn hơn cạnh còn lại thì là tam giác, và cạnh phải là số dương
public class Ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 3 canh cua tam giac: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a+b>c || b+c>a || a+c>b){
            System.out.println("la tam giac");}
        
    }
}
