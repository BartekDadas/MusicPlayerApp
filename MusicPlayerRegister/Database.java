package MusicPlayerRegister;

import java.util.ArrayList;

public class Database {

    ArrayList<User> users = new ArrayList<User>();

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

}
