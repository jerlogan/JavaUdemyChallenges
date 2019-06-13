package LinkedLists1;

import java.util.ArrayList;
import java.util.LinkedList;

public class Playlist {
    private ArrayList<Album> albums;

    public Playlist(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }
}
