package com.ViewModel;

import com.Model.SongDatabase;
import com.Model.UserDatabase;
import com.Model.User;
import com.Model.Message;
import com.Model.MusicCategory;
import com.Model.AccessType;

public class MainViewModel {

    UserDatabase userDB = new UserDatabase();
    SongDatabase songDB = new SongDatabase();

    void createUser(String login, String password) {
        userDB.post(login, password);
    }

    void deleteUser(User user) {
        userDB.delete(user);
    }

    void checkUser(String login, String password) {
        if (userDB.exist(login, password)) {
            System.out.println(Message.userExist);
        } else {
            System.out.println(Message.userMissing);
        }
    }

//    SONG LOGIC

    void addSongToMyList(String title, String author, MusicCategory category ) {
        if (songDB.verifySong(title, author, category)) {
            songDB.post(title, author, category);



        }

    }

    void showAllSongs() {
        songDB.list.forEach(System.out::println);
    }
    void showMyList() {

    }

    void removeSongFromMyList(){

    }

}
