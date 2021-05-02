package com.Model;

import java.util.UUID;

public class Song {

    String id = UUID.randomUUID().toString();
    String title;
    String author;
    MusicCategory category;

    public Song(String title, String author, MusicCategory category) {
        this.title = title;
        this.author = author;
        this.category = category;
    }
}
