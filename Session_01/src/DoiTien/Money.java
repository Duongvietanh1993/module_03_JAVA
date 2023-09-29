package DoiTien;

import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tền usd: ");
        usd = scanner.nextDouble();
        double quydoi = usd * vnd;
        System.out.println("Đổi ra tiền việt: " + quydoi);
    }
}
