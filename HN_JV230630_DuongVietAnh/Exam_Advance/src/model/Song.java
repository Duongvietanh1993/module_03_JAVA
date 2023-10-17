package model;

import java.util.Date;
import java.util.Scanner;

public class Song {
    private static int count = 1;
    private String songId;
    private String songName;
    private String descriptions;
    private Singer singer;
    private String songWriter;
    private Date createdDate;
    private boolean songStatus;

    public Song() {
        this.songId = generateSongId();
        this.createdDate = new Date();
    }

    public Song(String songName, String descriptions, Singer singer, String songWriter) {
        this.songId = generateSongId();
        this.songName = songName;
        this.descriptions = descriptions;
        this.singer = singer;
        this.songWriter = songWriter;
        this.createdDate = new Date();
    }

    private String generateSongId() {
        String id = "S" + String.format("%03d", count++);
        return id;
    }

    public String getSongId() {
        return songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public Singer getSinger() {
        return singer;
    }

    public void setSinger(Singer singer) {
        this.singer = singer;
    }

    public String getSongWriter() {
        return songWriter;
    }

    public void setSongWriter(String songWriter) {
        this.songWriter = songWriter;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public boolean isSongStatus() {
        return songStatus;
    }

    public void setSongStatus(boolean songStatus) {
        this.songStatus = songStatus;
    }

    public void inputData(Singer[] singerList, int countSinger) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tên bài hát: ");
        songName = scanner.nextLine();
        // Kiểm tra tên bài hát không để trống
        while (this.songName.isEmpty()) {
            System.err.println("Tên bài hát không được để trống. Vui lòng nhập lại: ");
            this.songName = scanner.nextLine();
        }

        System.out.println("Mô tả bài hát: ");
        descriptions = scanner.nextLine();

        System.out.println("Người sáng tác: ");
        songWriter = scanner.nextLine();
        // Kiểm tra tên người sáng tác không để trống
        while (this.songWriter.isEmpty()) {
            System.err.println("Tên người sáng tác không được để trống. Vui lòng nhập lại: ");
            this.songWriter = scanner.nextLine();
        }

        System.out.println("Trạng thái(true đã phát hành, false chưa phát hành: ");
        songStatus= Boolean.parseBoolean(scanner.nextLine());

       /* System.out.println("Lựa chọn ca sĩ bằng ID: ");
        int singerId = Integer.parseInt(scanner.nextLine());

        // Tìm ca sĩ trong danh sách ca sĩ
        int singerIndex = -1;
        for (int i = 0; i < countSinger; i++) {
            if (singerList[i].getSingerId() == singerId) {
                singerIndex = i;
                break;
            }
        }

        // Nếu tìm thấy ca sĩ, thêm vào danh sách ca sĩ của bài hát
        if (singerIndex != -1) {
            singer = singerList[singerIndex];
            System.out.println("Ca sĩ đã được thêm vào bài hát.");
        } else {
            System.out.println("Không tìm thấy ca sĩ có ID: " + singerId);
            System.out.println("Vui lòng thêm ca sĩ vào danh sách trước khi tạo bài hát.");
            return; // Thoát khỏi phương thức inputData() nếu không tìm thấy ca sĩ
        }*/


    }

    public void displayData() {
        System.out.println(
                "SongId: " + songId + '\n' +
                        "SongName: " + songName + '\n' +
                        "Descriptions: " + descriptions + '\n' +
                        "Singer: " + Singer.getSingerName() + '\n' +
                        "SongWriter: " + songWriter + '\n' +
                        "CreatedDate: " + createdDate + '\n' +
                        "SongStatus: " + (songStatus?"Phát hành":"Chưa phát hành") + '\n'
        );
    }
}
