package xoaPhanTu;

import java.util.Arrays;
import java.util.Scanner;

public class XoaPhanTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*Nhập vào mảng*/
        System.out.println("Nhập số phần tử trong mảng: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử " + (i + 1) + ":");
            arr[i] = sc.nextInt();
        }

        /*Nhập vào x cần xóa*/
        System.out.println("Nhập vào số cần xóa: ");
        int x = sc.nextInt();

        /*Tìm xem x có trong mảng và chỉ ra được vị trí của nó*/
        int index_del = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index_del = i;
                break;
            }
        }
        if (index_del == -1) {
            System.out.println("Không thuộc mảng");
        } else {
            for (int i = index_del; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;
            System.out.println("Mang sau khi xoa phan tu " + x + ":");
            System.out.println(Arrays.toString(Arrays.copyOf(arr, n)));
        }

    }
}
