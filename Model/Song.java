package com.Model;

import java.util.UUID;

enum MusicCategory{
    RAP, ROCK, METAL, TECHNO
}

public class Song {

    String id = UUID.randomUUID().toString();
    String title;
    String author;
    MusicCategory category;

    Song(String title,String author, MusicCategory category) {
        this.title = title;
        this.author = author;
        this.category = category;
    }

}
