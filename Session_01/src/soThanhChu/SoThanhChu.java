package soThanhChu;

import java.util.Scanner;

public class SoThanhChu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời Nhập vào Số:");
        int so = sc.nextInt();
        String chuoi = "";
        switch (so) {
            case 0:
                chuoi = "Không";
                break;
            case 1:
                chuoi = "Một";
                break;
            case 2:
                chuoi = "Hai";
                break;
            case 3:
                chuoi = "Ba";
                break;
            case 4:
                chuoi = "Bốn";
                break;
            case 5:
                chuoi = "Năm";
                break;
            case 6:
                chuoi = "Sáu";
                break;
            case 7:
                chuoi = "Bẩy";
                break;
            case 8:
                chuoi = "Tám";
                break;
            case 9:
                chuoi = "Chín";
                break;
            case 10:
                chuoi = "Mười";
                break;
            default:
                chuoi="Vượt Quá";
                break;
        }
        System.out.println(chuoi);
    }


}
