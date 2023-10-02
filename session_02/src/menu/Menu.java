package menu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = -1;
        while (choice != 0) {
            System.out.println("====== Menu =====");
            System.out.println("1.Kiểm tra tính chẵn lẻ");
            System.out.println("2.Kiểm tra số nguyên tố");
            System.out.println("3.Kiểm tra số có chia hết cho 3");
            System.out.println("Thoát");
            System.out.print("Mời bạn nhập lựa chọn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("==== Kiểm tra chẵn lẻ ====");
                    break;
                case 2:
                    System.out.println("==== Kiểm tra số nguyên tố ====");
                    break;
                case 3:
                    System.out.println("==== Kiểm tra chia hết cho 3 ====");
                    break;
            }
        }
    }
}
