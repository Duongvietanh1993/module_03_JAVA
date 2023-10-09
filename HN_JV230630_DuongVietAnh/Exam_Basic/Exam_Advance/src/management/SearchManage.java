package management;

import model.Singer;
import model.Song;

import java.util.Scanner;
import static management.SingerManage.countSinger;
import static management.SingerManage.singerList;

public class SearchManage {
    static Scanner scanner = new Scanner(System.in);
    public static void showSearch() {

        String menu = "=========Menu Quản Lý Tìm Kiếm==========\n" +
                "1.Tìm kiếm bài hất theo tên ca sĩ\n" +
                "2.Tìm kiếm bài hát theo tên hoặc thể loại\n" +
                "3.Hiển thị danh sách bài hát theo thứ tự tên tăng dần\n" +
                "4.Hiển thị 10 bài hát được đăng mới nhất\n" +
                "0.Quay lại Menu chính\n";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("Nhập lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:

                    break;
                case 2:
                    findSinger();
                    break;
                case 3:

                    break;
                case 4:

                    break;
            }
        } while (choice != 0);

    }

    public static void findSinger() {
        System.out.println("---- Tìm Kiếm ----");
        System.out.println("Nhập vào thể loại muốn tìm");
        scanner.nextLine();

        String genre = scanner.nextLine().trim().toLowerCase();
        boolean check = false;
        System.out.println("---- Kết quả tìm kiếm ----");
        for (int i = 0; i < countSinger; i++) {
            Singer singers = singerList[i];
            if (singers.getGenre().contains(genre)) {
                singers.displayData();
                check = true;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy thể loại có tên: " + genre);
        }
    }

//    public static void sortInterest() {
//        System.out.println("---- Sắp xếp ----");
//        for (int i = 0; i < countSinger - 1; i++) {
//            for (int j = i + 1; j < countSinger; j++) {
//                if (singerList[j].getSingerName() < singerList[i].getSingerName()) {
//                    // Hoán đổi vị trí của hai sách
//                    Singer temp = singerList[i];
//                    singerList[i] = singerList[j];
//                    singerList[j] = temp;
//                }
//            }
//        }
//        for (int i = 0; i < countSinger; i++) {
//            singerList[i].displayData();
//        }
//    }
}
