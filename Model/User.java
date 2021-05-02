package com.Model;

import java.util.ArrayList;
import java.util.UUID;


public class User {

    String id = UUID.randomUUID().toString();
    String login;
    String password;
    public ArrayList<Playlist> playlists = new ArrayList<>();



    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }



}
