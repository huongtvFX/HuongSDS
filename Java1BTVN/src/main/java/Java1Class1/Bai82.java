package Java1Class1;

import java.util.Scanner;

public class Bai82 {
    public static void main(String[] args) {
        /*
            Bai 82: Viết chương trình tìm số lớn
            nhất trong ba số thực a, b, c.
         */

        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.println("Nhap 3 so a, b, c");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();

        if (a > b && a > c) {
            System.out.println("max la: " +a);
        } else if (b > a && b > c) {
            System.out.println("max la: "+b);
        }else {
            System.out.println("max la: "+c);
        }
    }
}
