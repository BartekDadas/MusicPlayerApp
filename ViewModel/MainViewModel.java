package com.ViewModel;

import com.Model.SongDatabase;
import com.Model.UserDatabase;
import com.Model.User;
import com.Model.Message;
import com.Model.MusicCategory;
import com.Model.ListMoves;

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

    void showAllSongs() {
        songDB.list.forEach(System.out::println);
    }
    void showMyList() {
        songDB.myList.forEach(System.out::println);
    }

}
