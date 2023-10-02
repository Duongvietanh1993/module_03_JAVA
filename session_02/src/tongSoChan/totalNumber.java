package tongSoChan;

import java.util.Scanner;

public class totalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào giá trị đầu khoảng: ");
        int start = sc.nextInt();
        System.out.println("Nhập vào giá trị kết thúc khoảng: ");
        int end = sc.nextInt();

        int total = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                total += i;
            }
        }
        System.out.println("tổng các số trong khoảng " + start + " đến " + end + " là: " + total);
    }
}
