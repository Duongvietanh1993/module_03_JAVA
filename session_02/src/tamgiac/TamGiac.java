package tamgiac;

import java.util.Scanner;

public class TamGiac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Nhập cạnh a: ");
            double a = sc.nextDouble();
            System.out.println("Nhập cạnh b: ");
            double b = sc.nextDouble();
            System.out.println("Nhập cạnh c: ");
            double c = sc.nextDouble();

            if (a > 0 && b > 0 && c > 0) {
                if (a + b > c && a + c > b && b + c > a) {
                    double perimeter = a + b + c;
                    double p = perimeter / 2;
                    double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                    System.out.println("chu vi tam giác là: " + perimeter + " diện tích tacm giác là: " + area);
                } else {
                    System.out.println("Không là hình tam giác");
                }
            } else {
                System.out.println("Không là hình tam giác");
            }
        }
    }
}
