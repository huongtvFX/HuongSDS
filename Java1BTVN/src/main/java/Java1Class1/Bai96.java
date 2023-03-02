package Java1Class1;

import java.util.Scanner;

public class Bai96 {
    public static void main(String[] args) {
        /*
            Viết chương trình nhập giá trị x sau khi tính giá trị của hàm số:
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao x ");
        double x = scanner.nextInt();
        if (x >= 5) {
            double fx = 2*Math.pow(x,2) + 5*x + 9;
            System.out.println("F(x) = " + fx);
        }else {
            double fx = -2*Math.pow(x,2) + 4*x - 9;
            System.out.println("F(x) = " + fx);
        }

    }
}
