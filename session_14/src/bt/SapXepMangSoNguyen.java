package bt;

import java.util.Arrays;
import java.util.Collections;

public class SapXepMangSoNguyen {
    public static void main(String[] args) {
        int[] arr = getArr();
        System.out.println("Mảng trước khi sắp xếp:");
        System.out.println(Arrays.toString(arr));

        selectionSort(arr);
        System.out.println("Mảng sau khi sắp xếp chọn:");
        System.out.println(Arrays.toString(arr));

        insertionSort(arr);
        System.out.println("Mảng sau khi sắp xếp chèn:");
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);
        System.out.println("Mảng sau khi sắp xếp bóng bóng:");
        System.out.println(Arrays.toString(arr));
    }

    /*chọn*/
    private static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    /*chèn*/
    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    /*nổi bọt*/
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    private static int[] getArr(){
        int arr[] = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        return arr;

    }
}
