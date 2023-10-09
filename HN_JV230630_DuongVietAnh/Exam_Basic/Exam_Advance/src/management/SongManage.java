package management;

import model.Singer;
import model.Song;

import java.util.Scanner;

import static management.SingerManage.countSinger;
import static management.SingerManage.singerList;

public class SongManage {
    static Song[] songList = new Song[100];
    static int countSong = 0;
    static Scanner scanner = new Scanner(System.in);


    public static void showSongManagement() {
        Song newSong = songList[countSong];
        songList[countSong++]=new Song("À Lôi","Chất",null,"DTT");


        String menu = "=========Menu Quản Lý Bài Hát==========\n" +
                "1.Thêm mới\n" +
                "2.Hiển thị tất cả danh sách\n" +
                "3.Sửa thông tin\n" +
                "4.Xóa\n" +
                "0.Quay lại Menu chính\n";
        int choice;
        do {
            System.out.println(menu);
            System.out.println("Nhập lựa chọn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                addSong();
                    break;
                case 2:
                displayListSong();
                    break;
                case 3:
                editSong();
                    break;
                case 4:
                deleteSong();
                    break;
            }
        } while (choice != 0);

    }

    /*tìm kiếm theo id*/
    public static int findIndexById(String id) {
        for (int i = 0; i < countSong; i++) {
            if (songList[i].getSongId().equalsIgnoreCase(id)) {
                return i;
            }
        }
        return -1;
    }

    /*Thêm mới*/
    public static void addSong() {
        System.out.print("Nhập số lượng bài hát cần thêm: ");
        int count = scanner.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.println("Nhập thông tin cho bài hát thứ " + (i + 1));
            Song song = new Song();
            song.inputData(singerList,countSinger);

            songList[countSong++] = song;
        }

        System.out.println("Thêm bài hát thành công.");
    }

    /*Hiển thị all*/
    public static void displayListSong() {
        System.out.println("----- Danh Sách Bài Hát -----");
        for (int i = 0; i < countSong; i++) {
            songList[i].displayData();
        }
        System.out.println("----------------------------");
    }

    /*sửa*/
    public static void editSong() {
        System.out.println("Nhập vào Id bài hát muốn sửa: ");
        String songId = scanner.nextLine();
        int editId = findIndexById(songId);
        if (editId != -1) {
            Song songs = songList[editId];
            System.out.println("----- Cập nhật lại thông tin -----");
            songs.displayData();
            songs.inputData(singerList,countSinger);
            songList[editId] = songs;
            System.out.println("Thành công cập nhật lại thông tin");
        } else {
            System.out.println("Không tìm thấy bài hát có Id: " + songId);
        }
    }

    /*xóa*/
    public static void deleteSong() {
        System.out.println("Nhập Id của bài hát muốn xóa: ");
        String songId = scanner.nextLine();
        int deleteIndex = findIndexById(songId);
        if (deleteIndex != -1) {
            Song deletedSong = songList[deleteIndex];
            for (int i = deleteIndex; i < countSong - 1; i++) {
                songList[i] = songList[i + 1];
            }
            countSong--;
            System.out.println("Đã xóa bài hát:\n"  );
            deletedSong.displayData();
        } else {
            System.err.println("Không tìm thấy bài hát có Id=" + songId);
        }
    }
}
