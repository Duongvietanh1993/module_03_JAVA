package tinhTongMotCotMang2Chieu;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số phần tử mảng N: ");
        int n = scanner.nextInt();
        System.out.println("Số phần tử mảng M: ");
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Nhập vào phần tử thứ " + i + " * " + j);
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        System.out.println("Nhập vào cột muốn cộng tổng: ");
        int colum = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i][colum];
        }
        System.out.println("Tổng của hàng " + colum + " là: " + sum);
    }
}
