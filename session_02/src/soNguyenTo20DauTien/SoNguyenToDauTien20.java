package soNguyenTo20DauTien;

import java.util.Scanner;

public class SoNguyenToDauTien20 {
    public static void main(String[] args) {
        int countSNT;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng số NT muốn in: ");
        countSNT = sc.nextInt();
        int count = 0;
        for (int i = 2; count < countSNT; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                count++;
                System.out.println("20 số nguyên tố đầu tiên là: " + i);
            }
        }
    }
}
