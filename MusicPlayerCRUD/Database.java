package MusicPlayerCRUD;

import java.util.ArrayList;

public class Database {

    ArrayList<Song> list = new ArrayList<>();

    void post(Song song) {
        list.add(song);
    }

    void put(int index, Song song) {
        try {
            list.set(index, song);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    void delete(Song song) {
        try {
            list.remove(song);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}


