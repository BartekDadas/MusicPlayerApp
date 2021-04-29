package com.View;

import com.Model.MusicCategory;
import com.Model.Playlist;
import com.Model.Song;
import com.ViewModel.MainViewModel;


public class Main {
    public static void main(String[] args) {
        MainViewModel musicList = new MainViewModel();
        Playlist playlist1 = new Playlist("mySongs");
        Song song1 = new Song("We will rock you","Queen",MusicCategory.ROCK);

        musicList.login("Mark1342", "9870");


        musicList.makeNewPlaylist("mySongs");
        musicList.addSongTo(playlist1, song1);
        musicList.showPlaylist(playlist1);




    }
}