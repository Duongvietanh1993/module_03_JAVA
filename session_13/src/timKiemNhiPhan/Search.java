package timKiemNhiPhan;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 2, 4, 5, 7, 8, 9, 11, 13, 14, 16};
        System.out.println("Nhập vào sô muốn tìm kiếm");
        int numberSearch = scanner.nextInt();

        int low = 0;
        int high = arr.length - 1;

        boolean isFound = true;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == numberSearch) {
                System.out.println(numberSearch + " ở trong mảng vị trí " + mid +"\n");
                isFound=false;
                return;
            }
            if (arr[mid] < numberSearch) {
                low = mid + 1;
            }else {
                high=mid-1;
            }
        }
        if (isFound){
            System.out.println("không tồn tại trong mảng");
        }
    }


}
