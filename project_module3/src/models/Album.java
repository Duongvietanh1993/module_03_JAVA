package models;

import java.util.List;

public class Album {
    private String albumID;
    public String account;
    private List<TheSong> listSong;

    public Album(String albumID, List<TheSong> listSong) {
        this.albumID = albumID;
        this.listSong = listSong;
//        this.account = Register.user.getAccount();
    }

    public String getAlbumID() {
        return albumID;
    }

    public void setAlbumID(String albumID) {
        this.albumID = albumID;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public List<TheSong> getListSong() {
        return listSong;
    }

    public void setListSong(List<TheSong> listSong) {
        this.listSong = listSong;
    }

    @Override
    public String toString() {
        return "Mã album: " + albumID +
                " - Danh sách bài hát: " + listSong;
    }
}
