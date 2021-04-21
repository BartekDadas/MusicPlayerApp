package com.ViewModel;

import com.Model.Message;
import com.Model.User;
import com.Model.UserDatabase;
import com.Model.SongDatabase;

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


    void showAllSongs() {
        songDB.list.forEach(System.out::println);
    }

}
