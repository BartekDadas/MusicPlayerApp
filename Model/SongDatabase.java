package com.Model;


import java.util.ArrayList;
import java.util.List;


public class SongDatabase {// extends Access

    Song song1 = new Song("We will rock you","Queen",MusicCategory.ROCK);
    Song song2 = new Song("Rap god", "Eminem", MusicCategory.RAP);
    Song song3 = new Song("Nothing else matters", "Metallica", MusicCategory.METAL);
    Song song4 = new Song("Sandstorm", "Darude",MusicCategory.TECHNO);
    Song song5 = new Song("Roar", "Katy Perry",MusicCategory.POP);

    public ArrayList<Song> list = new ArrayList<>(List.of(song1, song2, song3, song4, song5));
    
    public boolean verifySong(Song song) {
        for(Song listSong: list){
            if (song == listSong) {
                return true;
            }
        }
        return false;
    }



}


