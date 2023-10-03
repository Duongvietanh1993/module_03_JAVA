package thucHanh;

import java.util.Scanner;

public class TimGiaTriLon {
    public static void main(String[] args) {
        //Khai báo biến và kiểm tra kích thước mảng
        int size;
        int[] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước mảng:");
            size = sc.nextInt();
            if (size > 20)
                System.out.println("Kích thước mảng không vượt quá 20 ");
        } while (size > 20);
        //Nhập phần tử
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Nhập phần tử " + (i + 1) + ": ");
            array[i] = sc.nextInt();
            i++;
        }
        //In ra
        System.out.print("Danh sách: ");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
        //tìm giá trị max
        int max = array[0];
        int index = 1;
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("Số lớn nhất là " + max + " , ở vị trí " + index);
    }
}
