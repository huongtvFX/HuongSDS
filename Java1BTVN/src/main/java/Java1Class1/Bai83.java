package Java1Class1;

import java.util.Scanner;

public class Bai83 {
    public static void main(String[] args) {
        /*
            Viết chương trình nhập vào hai số thực. Kiểm tra xem chúng có cùng
            dấu hay không.
         */

        Scanner scanner = new Scanner(System.in);
        double a,b;
        System.out.println("Nhap 2 so a,b ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (a == 0 || b==0) {
            System.exit(0);
        } else if (a * b > 0) {
            System.out.println("hai so cung dau");
        }else {
            System.out.println("hai so khac dau");
        }
    }
}
