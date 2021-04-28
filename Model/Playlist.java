package com.Model;

import java.util.ArrayList;
import java.util.UUID;

public class Playlist {

    String id = UUID.randomUUID().toString();
    String title;
    ArrayList<Song> songs = new ArrayList<>();

    public Playlist(String name) {
        this.title = name;
    }

    public void post(Song song) {
        songs.add(song);
    }

    public void delete(Song song) {
        songs.remove(song);
    }

    public void get() {
        songs.forEach(System.out::println);
    }

    public void changeTitle(String newTitle) {
        title = newTitle;
    }

}
