package thucHanh;

import java.util.Scanner;

public class NamNhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số năm bạn muốn kiểm tra: ");
        int year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Năm " + year + " là năm nhuận");
                } else {
                    System.out.println("Năm " + year + " không là năm nhuận");
                }
            } else {
                System.out.println("Năm " + year + " là năm nhuận");
            }
        } else {
            System.out.println("Năm " + year + " không là năm nhuận");
        }
    }
}
