package Java1Class1;

import java.util.Scanner;

public class Bai97 {
    public static void main(String[] args) {
        /*
            Viết chương trình nhập 3 cạnh của một tam giác.
            Hãy cho biết đó là tam giác gì?
         */
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("Nhap vao 3 canh cua tam giac ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        if (a + b < c || a + c < b || b + c < a) {
            System.out.println("ko la tam giac");
        }else if (a == b && a == c && b==c) {
            System.out.println("La tam giac deu");
        } else if (a == b || a == c || b == c) {
            System.out.println("La tam giac can");
        }
    }
}
