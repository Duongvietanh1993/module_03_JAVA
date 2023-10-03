package timMaxthu2;

import java.util.Arrays;
import java.util.Scanner;

public class TimMaxThu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng phần tử trong mảng");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Nhâp phần tử thứ " + (i + 1));
            arr[i] = scanner.nextInt();
        }

        System.out.println(Arrays.toString(arr));

        int max = arr[0];
        int max2 = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max2 = max;
                max = arr[i];
            }
        }
        System.out.println(max2);
    }
}
