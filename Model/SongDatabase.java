package com.Model;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;


public class SongDatabase {// extends Access

    Song song1 = new Song("We will rock you","Queen",MusicCategory.ROCK);
    Song song2 = new Song("Rap god", "Eminem", MusicCategory.RAP);
    Song song3 = new Song("Nothing else matters", "Metallica", MusicCategory.METAL);
    Song song4 = new Song("Sandstorm", "Darude",MusicCategory.TECHNO);
    Song song5 = new Song("Roar", "Katy Perry",MusicCategory.POP);

    public ArrayList<Song> list = new ArrayList<>(List.of(song1, song2, song3, song4, song5));

    public ArrayList<Song> myList = new ArrayList<>(List.of(song5, song4));

    public ArrayList<ArrayList<Song>> playlists = new ArrayList<>();


    public void post(String title, String author, MusicCategory category) {
        Song song = new Song(title, author, category);
        for(Song listSong: list){
            if (song == listSong) {
                myList.add(listSong);
            }
        }

    }

    public boolean verifySong(String title, String author, MusicCategory category) {
        Song song = new Song(title, author, category);
        for(Song listSong: list){
            if (song == listSong) {
                return true;
            }
        }
        return false;
    }

    public void delete(String title, String author, MusicCategory category) {
        Song song = new Song(title, author, category);
        myList.removeIf(listSong -> song == listSong);
    }

    public void createNewList(ArrayList<Song> name) {
        playlists.add(name);
    }
    public void removeNewList(ArrayList<Song> name) {
        playlists.remove(name);

    }

//    public ArrayList<Song> makeNewList() {
//        return new ArrayList<>();
//    }
//
//    public void deleteList(ArrayList theList) {
//        theList.clear();
//    }

}


