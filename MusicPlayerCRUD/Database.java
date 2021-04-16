package MusicPlayerCRUD;

import java.util.ArrayList;

public class Database {

    ArrayList<String> list = new ArrayList<String>();

    void post(String item) {
        list.add(item);
    }

    void put(int index, String item) {
        try {
            list.set(index, item);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    void delete(String item) {
        try {
            list.remove(item);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}


