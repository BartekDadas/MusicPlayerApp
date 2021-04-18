package MusicPlayerCRUD;

class MainModelView {
    Database db = new Database();

    void  getSong(String title,String author, String id, MusicCategory category) {
        Song song = new Song(title, author, id, category);
        db.post(song);
    }

    void showPlaylist() {
        db.list.forEach(System.out::println);
    }

    void updateSong(int index, String title,String author, String id, MusicCategory category) {
        Song newSong = new Song(title,author, id, category);
        db.put(index, newSong);
    }

    void deleteSong(String title,String author, String id, MusicCategory category) {
        Song song = new Song(title,author, id, category);
        db.delete(song);
    }


}
