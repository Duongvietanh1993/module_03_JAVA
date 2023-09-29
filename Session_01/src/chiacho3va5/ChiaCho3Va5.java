package chiacho3va5;

import java.util.Scanner;

public class ChiaCho3Va5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Số muốn kiểm tra");
        int numb = sc.nextInt();
        if (numb % 15 == 0) {
            System.out.println("Chia hết cho cả 3 và 5");
        } else if (numb % 5 == 0) {
            System.out.println("Chỉ chia hết cho 5");
        } else if (numb % 3 ==0) {
            System.out.println("Chỉ chia hết cho 3");
        }else {
            System.out.println("Không chia hết cho cả 3 và 5");
        }
    }
}
