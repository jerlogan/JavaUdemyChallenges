package LinkedLists1;

import java.util.LinkedList;

public class Album {
    private String artist;
    private String albumName;
    private LinkedList<Song> albumSongs = new LinkedList<Song>();

    public Album() {
    }

    public Album(String artist, String albumName, LinkedList<Song> albumSongs) {
        this.artist = artist;
        this.albumName = albumName;
        this.albumSongs = albumSongs;
    }

    public String getArtist() {
        return artist;
    }

    public String getAlbumName() {
        return albumName;
    }

    public LinkedList<Song> getAlbumSongs() {
        return albumSongs;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public void setAlbumSongs(LinkedList<Song> albumSongs) {
        this.albumSongs = albumSongs;
    }
}
