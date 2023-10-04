package phuongThucIsEmpty;

import java.util.Scanner;

public class PhuongThucIsEmpty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một chuỗi");
        String str = scanner.nextLine();

        System.out.println("chuỗi rỗng: "+isEmptyString(str));
    }
    public static boolean isEmptyString(String str) {
        return str.isEmpty();
    }
}
