package com.Model;

import java.util.ArrayList;

public class UserDatabase {
    // change for collection?
    public ArrayList<User> users = new ArrayList<>();

    public void post(String login, String password) {
        users.add(new User(login, password));
    }

    public void delete(User user) {
        try {
            users.remove(user);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public boolean exist(String login, String password){
        for(User user: users) {
            if (user.login.equals(login) && user.password.equals(password)) {
                return true;
            }
        }
        return false;
    }

//    boolean registration(User user) {
//        if (user.password.length() <= 8) {
//            return true;
//        } else {
//            return false;
//        }
//    }

}
