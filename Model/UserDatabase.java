package com.Model;

import java.util.ArrayList;
import java.util.List;

public class UserDatabase {

    User Mark = new User("Mark435", "9780");

    public ArrayList<User> users = new ArrayList<>(List.of(Mark));

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

    public User exist(String login, String password) {
        for (User user : users) {
            if (user.login.equals(login) && user.password.equals(password)) {
                return user;
            }
        }
        return null;
    }

    public void changePassword(String login, String oldPassword, String newPassword) {
        for (User user : users) {
            if (user.login.equals(login) && user.password.equals(oldPassword)) {
                user.password = newPassword;
            }
        }
    }


}
