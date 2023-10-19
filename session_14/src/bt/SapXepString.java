package bt;

import java.util.Arrays;

public class SapXepString {
    public static void main(String[] args) {
        String[] arr = {"banana", "apple", "orange", "grape", "pear"};
        bubbleSort(arr);
        System.out.println("Sắp xếp bong bóng" + Arrays.toString(arr));
        insertSort(arr);
        System.out.println("Sắp xếp chèn" + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("Sắp xếp chọn" + Arrays.toString(arr));
    }

    public static void bubbleSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void insertSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String currentElement = arr[i];
            int j;
            for (j = i - 1; j >= 0 && arr[j].compareTo(currentElement) > 0; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = currentElement;
        }
    }

    public static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            String currentMin = arr[i];
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (currentMin.compareTo(arr[j]) > 0) {
                    currentMin = arr[j];
                    index = j;
                }
            }
            if (index != i) {
                arr[index] = arr[i];
                arr[i] = currentMin;
            }
        }
    }
}
