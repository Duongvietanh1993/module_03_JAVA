package tinhTongSoNguyen;

import java.util.Scanner;

public class TinhTongSoNguyen {
    public static void main(String[] args) {
        int sum = 0;

        try {
            sum = getSumFromUserInput();
            System.out.println("Tổng hai số là: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Hãy nhập vào số nguyên.");
            main(args); // Đệ quy để yêu cầu người dùng nhập lại
        }
    }

    public static int getSumFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số thứ nhất: ");
        int num1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhập số thứ hai: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        return num1 + num2;
    }
}
