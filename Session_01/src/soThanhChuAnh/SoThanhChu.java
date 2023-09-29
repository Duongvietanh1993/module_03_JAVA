package soThanhChuAnh;

import java.util.Scanner;

public class SoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Mời nhập số: ");
            int so = sc.nextInt();
            if (so < 1000) {
                int donVi = so % 10;
                int hangChuc = (so / 10) % 10;
                int hangTram = so / 100;
                String chuoi = "";
                if (hangTram > 0) {
                    chuoi += layChuoi(hangTram) + "hundred ";
                }
                if (hangChuc > 1) {
                    chuoi += layChuoi(hangChuc) + "ty ";
                } else if (hangChuc == 1) {
                    int soHangDonVi = hangChuc * 10 + donVi;
                    chuoi += layChuoi(soHangDonVi);
                }
                if (donVi > 0 && hangChuc != 1) {
                    chuoi += layChuoi(donVi);
                }
                System.out.println("Kết quả: " + chuoi);
            } else {
                System.out.println("Số vượt quá giới hạn. Vui lòng nhập số nhỏ hơn 1000.");
            }
        }
    }

    public static String layChuoi(int so) {
        String chuoi = "";
        switch (so) {
            case 1:
                chuoi = "one";
                break;
            case 2:
                chuoi = "two";
                break;
            case 3:
                chuoi = "three";
                break;
            case 4:
                chuoi = "four";
                break;
            case 5:
                chuoi = "five";
                break;
            case 6:
                chuoi = "six";
                break;
            case 7:
                chuoi = "seven";
                break;
            case 8:
                chuoi = "eight";
                break;
            case 9:
                chuoi = "nine";
                break;
        }
        return chuoi;
    }
}