package com.Model;

import java.util.UUID;

public class User {

    String id = UUID.randomUUID().toString();
    String login;
    String password;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

}
