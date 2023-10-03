package gopMang;

import java.util.Arrays;
import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số phần tử màng 1: ");
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        System.out.println("Nhập phần tử mảng 1: ");
        for (int i = 0; i < N; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.print("Nhập số phần tử màng 2: ");
        int M = sc.nextInt();
        int[] arr2 = new int[M];
        System.out.println("Nhập phần tử mảng 2: ");
        for (int i = 0; i < M; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr3));

        for (int i = 0; i <= arr2.length - 1; i++) {
            arr3[arr1.length + i] = arr2[i];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
