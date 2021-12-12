package ClassesObjects;

import java.util.Scanner;

public class QuadraticEquation {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Nhập hệ số bậc 2, a = ");
        float a = QuadraticEquation.scanner.nextFloat();
        System.out.print("Nhập hệ số bậc 1, b = ");
        float b = QuadraticEquation.scanner.nextFloat();
        System.out.print("Nhập hằng số tự do, c = ");
        float c = scanner.nextFloat();
        QuadraticEquation.KetQua(a, b, c);
    }
    public static void KetQua(float a, float b, float c) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "r = " + (-c / b));
            }
            return;
        }
        float delta = b*b - 4*a*c;
        float r1;
        float r2;
        if (delta > 0) {
            r1 = (float) ((-b + Math.sqrt(delta)) / (2*a));
            r2 = (float) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "r1 = " + r1 + " và r2 = " + r2);
        } else if (delta == 0) {
            r1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "r1 = r2 = " + r1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}