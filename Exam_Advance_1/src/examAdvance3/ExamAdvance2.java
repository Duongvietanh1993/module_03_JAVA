package examAdvance3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExamAdvance2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> parentQueue = new LinkedList<>();

        String menu = "=========Menu chính==========\n" +
                "1. Nhập tên phụ huynh nộp hồ sơ\n" +
                "2. Phụ huynh tiếp theo\n" +
                "0. Thoát\n";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Nhập tên phụ huynh: ");
                    String parentName = scanner.nextLine();
                    parentQueue.add(parentName);
                    break;
                case 2:
                    if (!parentQueue.isEmpty()) {
                        String nextParent = parentQueue.poll();
                        System.out.println("Phụ huynh tiếp theo: " + nextParent);
                    } else {
                        System.out.println("Danh sách phụ huynh rỗng.");
                    }
                    break;
                default:
                    System.err.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }

            System.out.println(); // Xuống dòng để tạo khoảng cách giữa các lần chạy vòng lặp
        }while (choice!=0);
    }
}
