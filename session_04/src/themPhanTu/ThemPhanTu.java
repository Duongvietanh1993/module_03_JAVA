package themPhanTu;

import java.util.Arrays;
import java.util.Scanner;

public class ThemPhanTu {
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

        System.out.println(Arrays.toString(insertArr(arr,index,x)));
    }
    public static int[] insertArr(int[] arr, int index, int x) {
        if (index < 0 || index > arr.length)
            return arr;
        int[] newArr = new int[arr.length + 1];
        newArr[index] = x;
        for (int i = 0; i <= arr.length; i++) {
            if (i < index) {
                newArr[i] = arr[i];
            } else if (i > index) {
                newArr[i] = arr[i - 1];
            }
        }
        return newArr;
    }
}
