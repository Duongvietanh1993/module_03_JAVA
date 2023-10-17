package timKiemMang2Chieu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int[][] getArr() {
        int arr[][] = new int[20][20];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = (int) (Math.random() * 100);
            }
        }
        return arr;
    }

    private static boolean searchNumber(int[][] arr, int number, List<Integer> rowList, List<Integer> colList) {
        boolean check = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == number) {
                    rowList.add(i);
                    colList.add(j);
                    check = true;
                }
            }
        }
        return check;
    }

    public static void main(String[] args) {
        int[][] arr = getArr();

        System.out.println("Mảng số:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); // Xuống dòng sau khi in xong một hàng
        }

        List<Integer> rowList = new ArrayList<>();
        List<Integer> colList = new ArrayList<>();


        System.out.print("Nhập số cần tìm: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean check = searchNumber(arr, number, rowList, colList);

        if (check) {
            System.out.println("Các vị trí của số " + number + ":");
            for (int i = 0; i < rowList.size(); i++) {
                System.out.println("[" + rowList.get(i) + "," + colList.get(i) + "]");
            }
        } else {
            System.out.println("Số " + number + " không xuất hiện trong mảng.");
        }
    }
}
