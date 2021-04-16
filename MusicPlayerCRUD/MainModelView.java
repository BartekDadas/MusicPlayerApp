package MusicPlayerCRUD;

public class MainModelView {
    Database db = new Database();

    void  getSong(String song) {
        db.post(song);
    }
    void showPlaylist() {
        db.list.forEach(System.out::println);
    }
    void updateSong(int index, String newSong){
        db.put(index, newSong);
    }
    void deleteSong(String song) {
        db.delete(song);
    }
}
