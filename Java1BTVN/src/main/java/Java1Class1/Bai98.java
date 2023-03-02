package Java1Class1;

import java.util.Scanner;

public class Bai98 {
    public static void main(String[] args) {
        /*
            Lập chương trình giải hệ:
         */
        double a,b,c,d,e,f,x,y;
        System.out.print("Nhap a,b,c,d,e,f: ");
        Scanner in = new Scanner(System.in);
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        d = in.nextDouble();
        e = in.nextDouble();
        f = in.nextDouble();
        in.close();

        /*
            𝑎𝑥 + 𝑏𝑦 = c
            𝑑𝑥 + 𝑒𝑦 = f
         */

        double Axy = a * e - d * b;
        double Ax = c * e - f * b;
        double Ay = a * f - d * c;

        if (Axy == 0) {
            System.out.println("Hệ phương trình vô nghiệm");
        } else {
            x = Ax / Axy;
            y = Ay / Axy;

            System.out.printf("Nghiệm của hệ phương trình là x = %.2f và y = %.2f", x, y);
        }

    }
}
