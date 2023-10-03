package tinhTongDuongCheo;

import java.util.Arrays;
import java.util.Scanner;

public class TongDuongCheo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào số phần tử mảng N: ");
        int n = sc.nextInt();
        System.out.print("Nhập vào số phần tử mảng M: ");
        int m = sc.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("Nhập phần tử mảng [" + i + "] [" + j + "]: ");
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 += arr[i][i];
        }
        System.out.println("Tổng các phần tử trên đương chéo chính là: " + sum1);

        int sum2 = 0;
        int j = m - 1;
        for (int i = 0; i < n; i++) {
            sum2 += arr[i][j];
            j--;
        }
        System.out.println("Tổng các phần tử trên đương chéo phụ là: " + sum2);
    }
}
