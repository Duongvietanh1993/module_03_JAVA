package hackathon.manage;

import hackathon.model.Mark;
import hackathon.model.Subject;

import java.util.Scanner;

public class ManageMark {
    static Mark[] listMark = new Mark[100];
    static int countMark = 0;
    static Scanner scanner = new Scanner(System.in);
    public static void showManagementMark() {
        String menu = "=========Menu Quản lý Điểm Thi==========\n" +
                "1.Thêm mới\n" +
                "2.Hiển thị tất cả danh sách\n" +
                "3.Sửa thông tin\n" +
                "4.Xóa\n" +
                "0.Thoát khỏi chương trình\n";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
            }
        } while (choice != 0);
    }
}
