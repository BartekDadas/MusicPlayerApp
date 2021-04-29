package com.Model;



import java.util.ArrayList;
import java.util.UUID;

public class Playlist {

    String id = UUID.randomUUID().toString();
    String title;
    ArrayList<Song> songs = new ArrayList<>();

    public Playlist(String title) {
        this.title = title;
    }

    public void post(Song song) {
        songs.add(song);
    }

    public void delete(Song song) {
        if (checkPlaylist(song)) {
            songs.remove(song);
        }
    }

    public void get() {
        songs.forEach(System.out::println);
    }

    public void changeTitle(String newTitle) {
        title = newTitle;
    }

    boolean checkPlaylist(Song song){
        for(Song listSong: songs) {
            if (song == listSong) {
                return true;
            }
        }
        return false;
    }

}
