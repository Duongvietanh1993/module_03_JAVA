package timMaxMang2Chieu;

import java.util.Arrays;
import java.util.Scanner;

public class TimMaxMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số phần tử mảng N: ");
        int n = scanner.nextInt();
        System.out.println("Số phần ử mảng M: ");
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.println("Nhập phần tử thứ " + i + " * " + j);
                arr[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

        int max = arr[0][0];
        int rMax = 0;
        int cMax = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    rMax = i;
                    cMax = j;
                }
            }
        }
        System.out.println("Giá trị lớn nhất là: " + max + " vị trí " + rMax + " * " + cMax);
    }
}
