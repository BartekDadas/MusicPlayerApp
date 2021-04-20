package MusicPlayerRegister;

import java.util.ArrayList;

public class Database {

    ArrayList<User> users =  ArrayList(new User("Bob", "1234"));

    void post(User user) {
        users.add(user);
    }

    void put(int index, User user) {
        try {
            users.set(index, user);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    void delete(User user) {
        try {
            users.remove(user);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

//    boolean buildRegistration(User user) {
//        if (user.password.length() <= 8) {
//            return true;
//        } else {
//            return false;
//        }
//    }

}
