package tuyenTinhMax;

import java.util.Arrays;

public class Max {
    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("mảng sô nguyên: "+ Arrays.toString(arr));
        int max = findMax(arr);
        System.out.println("số lớn nhất: "+max);
    }

    private static int[] getArr() {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;

    }

    private static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
}
