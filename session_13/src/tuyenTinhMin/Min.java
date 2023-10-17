package tuyenTinhMin;

import java.util.Arrays;

public class Min {
    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("mảng sô nguyên: "+ Arrays.toString(arr));
        int min = findMin(arr);
        System.out.println("số nhỏ nhất: "+min);
    }

    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;

    }

    private static int findMin(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
