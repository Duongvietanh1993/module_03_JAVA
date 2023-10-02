package thucHanh;

import java.util.Scanner;

public class NgayTrongThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào tháng bạn muốn tính: ");
        int thang = scanner.nextInt();
        switch (thang) {
            case 2:
                System.out.println("Tháng " + thang + " có 28 ngày");
                break;
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng " + thang + " có 31 ngày");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Tháng " + thang + " có 30 ngày");
                break;
        }

    }
}
