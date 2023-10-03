package demSoLanSuatHien;

import java.util.Scanner;

public class DemLanSuatHien {
    public static void main(String[] args) {
        String str = "dem so lan xuat hien cua ký tu trong chuoi";
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập ký tự muốn tìm kiếm: ");
        char key = sc.nextLine().charAt(0);
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == key) {
                count++;
            }
        }
        System.out.printf("số lần xuất hiện của '%s' trong chuỗi là: %d", key, count);
    }
}
