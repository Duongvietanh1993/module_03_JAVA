package thucHanh;

import java.util.Scanner;

public class ChoVay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào số tiền: ");
        double tien = sc.nextDouble();
        System.out.println("Nhập số tháng: ");
        int thang = sc.nextInt();
        System.out.println("Nhập lại xuất: ");
        double laiXuat = sc.nextDouble();

        double tienLai = 0;
        for (int i = 0; i < thang; i++) {
            tienLai += tien * (laiXuat / 100) / 12 * thang;
        }
        System.out.println("Tiền lãi sau " + thang + " là " + tienLai);
    }
}
