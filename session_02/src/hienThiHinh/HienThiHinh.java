package hienThiHinh;

import java.util.Scanner;

public class HienThiHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner sc = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("========Menu=======");
            System.out.println("1.Hình Chữ Nhật");
            System.out.println("2.Hình Tam Giác Vuông Hướng Lên");
            System.out.println("3.Hình Tam Giác Vuông Hướng Xuống");
            System.out.println("4.Hình Tam Giác Cân");
            System.out.println("0.Thoát");
            System.out.println("Nhập vào lựa chọn của bạn: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    for (int i = 0; i < 3; i++) {
                        for (int j = 0; j < 6; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    for (int i = 1; i <= 6; i++) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 3:
                    for (int i = 6; i >= 1; i--) {
                        for (int j = 1; j < i; j++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    int n = 5; // Số hàng của tam giác cân
                    for (int i = 1; i <= n; i++) {
                        for (int j = 1; j <= n - i; j++) {
                            System.out.print("   ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print(" * ");
                        }
                        System.out.println("");
                    }
                    break;
            }
        }
    }
}