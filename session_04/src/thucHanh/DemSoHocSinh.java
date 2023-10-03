package thucHanh;

import java.util.Scanner;

public class DemSoHocSinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử mảng");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập vào phần tử thứ "+(i+1));
            arr[i] = sc.nextInt();
        }

        int count = 0;
        System.out.println("danh sách điểm: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            if (arr[i] >=5 && arr[i]<=10){
                count++;
            }
        }
        System.out.println("Số lượng học sinh đủ điểm qua môn :"+count);
    }
}
