package management;

import model.Singer;

import java.util.Scanner;

public class SingerManage {
    static Singer[] singerList = new Singer[100];
    static int countSinger = 0;
    static Scanner scanner = new Scanner(System.in);

    public static void showSingerManagement() {
        Singer newSinger = singerList[countSinger];
        singerList[countSinger++] = new Singer("Đen Vâu", 34, "Việt Nam", true, "Rap");
        singerList[countSinger++] = new Singer("Karik", 34, "Việt Nam", true, "Rap");
        singerList[countSinger++] = new Singer("SuBoi", 33, "Việt Nam", false, "Rap");

        String menu = "=========Menu Quản Lý Ca Sĩ==========\n" +
                "1.Thêm mới\n" +
                "2.Hiển thị tất cả danh sách\n" +
                "3.Sửa thông tin\n" +
                "4.Xóa\n" +
                "0.Quay lại Menu chính\n";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("Nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addSinger();
                    break;
                case 2:
                    displayListSinger();
                    break;
                case 3:
                    editSinger();
                    break;
                case 4:
                    deleteSinger();
                    break;
            }
        } while (choice != 0);
    }

    /*tìm kiếm theo id*/
    public static int findIndexById(int id) {
        for (int i = 0; i < countSinger; i++) {
            if (singerList[i].getSingerId() == id) {
                return i;
            }
        }
        return -1;
    }

    /*Thêm mới*/
    public static void addSinger() {
        System.out.print("Nhập số lượng ca sĩ cần thêm: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Nhập thông tin cho ca sĩ thứ " + (i + 1));
            Singer singer = new Singer();
            singer.inputData();
            singerList[countSinger++] = singer;
        }

        System.out.println("Thêm ca sĩ thành công.");
    }

    /*Hiển thị all*/
    public static void displayListSinger() {
        System.out.println("----- Danh Sách Ca Sĩ -----");
        for (int i = 0; i < countSinger; i++) {
            singerList[i].displayData();
        }
        System.out.println("----------------------------");
    }

    /*sửa*/
    public static void editSinger() {
        System.out.println("Nhập vào Id ca sĩ muốn sửa: ");
        int singerId = scanner.nextInt();
        int editId = findIndexById(singerId);
        if (editId != -1) {
            Singer singers = singerList[editId];
            System.out.println("----- Cập nhật lại thông tin -----");
            singers.displayData();
            singers.inputData();
            singerList[editId] = singers;
            System.out.println("Thành công cập nhật lại thông tin");
        } else {
            System.out.println("Không tìm thấy ca sĩ có Id: " + singerId);
        }
    }

    /*xóa*/
    public static void deleteSinger() {
        System.out.println("Nhập Id của ca sĩ muốn xóa: ");
        int singerId = scanner.nextInt();
        int deleteIndex = findIndexById(singerId);
        if (deleteIndex != -1) {
            Singer deletedSinger = singerList[deleteIndex];
            for (int i = deleteIndex; i < countSinger - 1; i++) {
                singerList[i] = singerList[i + 1];
            }
            countSinger--;
            System.out.println("Đã xóa ca sĩ:\n" );
            deletedSinger.displayData();
        } else {
            System.err.println("Không tìm thấy ca sĩ có Id=" + singerId);
        }
    }
}
