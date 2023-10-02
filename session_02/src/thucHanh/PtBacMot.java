package thucHanh;

import java.util.Scanner;

public class PtBacMot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Giải phương trình bậc 1");
        System.out.println("Nhập số a:");
        double a = scanner.nextDouble();
        System.out.println("Nhập số b:");
        double b = scanner.nextDouble();
        System.out.println("Nhập số c:");
        double c = scanner.nextDouble();
        if (a != 0) {
            double x = (c - b) / a;
            System.out.println("Phương trình có nghiệm x duy nhất là"  + x);
        } else {
            if (b == c) {
                System.out.println("Phương trình có vô số nghiệm");
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }
}
