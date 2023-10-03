package thucHanh;

import java.util.Arrays;
import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập vào độ dài mảng: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println();
            }
        } while (size > 20);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập các phần tử " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Các phần tử trong mảng: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.printf("\n%-20s%s", "mảng đảo ngược: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
