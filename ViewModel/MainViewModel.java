package com.ViewModel;

import com.Model.SongDatabase;
import com.Model.UserDatabase;
import com.Model.User;
import com.Model.Message;
import com.Model.MusicCategory;
import com.Model.ListMoves;
import com.Model.Song;

import java.util.ArrayList;

public class MainViewModel {

    UserDatabase userDB = new UserDatabase();
    SongDatabase songDB = new SongDatabase();

    public void createUser(String login, String password) {
        userDB.post(login, password);
    }

    public void deleteUser(User user) {
        userDB.delete(user);
    }

    public void checkUser(String login, String password) {
        if (userDB.exist(login, password)) {
            System.out.println(Message.userExist);
        } else {
            System.out.println(Message.userMissing);
        }
    }
    public void changeMyPassword(String login, String oldPassword, String newPassword) {
        userDB.changePassword(login, oldPassword, newPassword);
    }


//    SONG LOGIC


    public void moveSongOnMyList(String title, String author, MusicCategory category, ListMoves move) {
        if (songDB.verifySong(title, author, category)) {
            switch (move) {
                case ADD:
                    songDB.post(title, author, category);
                case REMOVE:
                    songDB.delete(title, author, category);
            }
        } else {
            System.out.println(Message.missingSong);
        }

    }

    public void makeNewList(ArrayList<Song> playlist) {
        songDB.createNewList(playlist);
    }
    public void deleteSongList(ArrayList<Song> playlist) {
        try {
            songDB.removeNewList(playlist);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showAllSongs() {
        songDB.list.forEach(System.out::println);
    }
    public void showMyList() {
        songDB.myList.forEach(System.out::println);
    }
}
