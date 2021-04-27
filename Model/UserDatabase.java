package com.Model;

import java.util.ArrayList;
import java.util.List;

public class UserDatabase {// extends Access

    User Mark = new User("Mark1342", "9780");

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

    public boolean exist(String login, String password) {
        for (User user : users) {
            if (user.login.equals(login) && user.password.equals(password)) {
                return true;
            }
        }
        return false;
    }
    public void changePassword(String login, String oldPassword, String newPassword) {// commit this
        for (User user : users) {
            if (user.login.equals(login) && user.password.equals(oldPassword)) {
                user.password = newPassword;
            }
        }

    }



//    boolean registration(User user) {
//        if (user.password.length() <= 8) {
//            return true;
//        } else {
//            return false;
//        }
//    }

}
