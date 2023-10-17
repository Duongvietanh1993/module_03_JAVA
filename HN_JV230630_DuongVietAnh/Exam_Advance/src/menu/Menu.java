package menu;

import management.SearchManage;
import management.SingerManage;
import management.SongManage;

import java.util.Scanner;
public class Menu {
    static Scanner scanner = new Scanner(System.in);
    public void showMain(String[] args) {
        String menu = "=========Menu chính==========\n" +
                "1.Quản lý ca sĩ\n" +
                "2.Quản lý bài hát\n" +
                "3.Tìm kiếm bài hát\n" +
                "0.Thoát khỏi chương trình\n";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    SingerManage.showSingerManagement();
                    break;
                case 2:
                    SongManage.showSongManagement();
                    break;
                case 3:
                    SearchManage.showSearch();
                    break;
                default:
                    System.err.println("Không có lựa chọn này, mời lựa chọn lại");
            }
        } while (choice != 0);
    }
}
