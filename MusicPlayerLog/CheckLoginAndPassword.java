package com.MusicPlayerLog;

import MusicPlayerRegister.Database;
import MusicPlayerRegister.User;

public class CheckLoginAndPassword {

    void checkUser(String login, String password) {
        Database db = new Database();
        for(User x: db.users) {
            if (x.equals(new User(login, password))) {

            }
            System.out.println("Access Denied");
        }
    }
}
