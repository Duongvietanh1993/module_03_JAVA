package timMinTrongMang;

import java.util.Arrays;
import java.util.Scanner;

public class TimMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phân tử thứ " + (i + 1));
            arr[i] = sc.nextInt();
        }
        System.out.println("Mảng bao gồm: " + (Arrays.toString(arr)));

        System.out.println("Nhập số X: ");
        int x = sc.nextInt();
        System.out.println("Nhập vào vị trí cần chèn vào mảng: ");
        int index = sc.nextInt();

        System.out.println("Mảng cũ " + Arrays.toString(arr));

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Giá trị nhỏ nhất: " + min);
    }
}
