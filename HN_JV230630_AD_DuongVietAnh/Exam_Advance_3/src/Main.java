import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> listQueue = new LinkedList<>();

        String menu = "******** Menu Chính ********\n" +
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
                    System.out.println("===== Menu Nhập =====" + '\n');
                    System.out.print("Nhập tên phụ huynh: ");
                    String parentName = scanner.nextLine();
                    listQueue.add(parentName);
                    System.out.println('\n' + "--- Danh sách phụ huynh ---");
                    for (String parents : listQueue) {
                        System.out.println("Tên phụ huynh: " + parents);
                    }
                    break;
                case 2:
                    System.out.println("===== In Tên Đầu Trong Danh Sách Và Xóa =====" + '\n');
                    if (listQueue.isEmpty()) {
                        System.err.println("Hiện danh sách không có phụ huynh nào, mời nhập vào");
                    } else {
                        String nextParent = listQueue.poll();
                        System.out.println("Phụ huynh ở đầu danh sách là: ");
                        System.out.println("Tên phụ huynh: " + nextParent);
                    }
                    break;
                default:
                    System.err.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }

            System.out.println();
        } while (choice != 0);
    }
}