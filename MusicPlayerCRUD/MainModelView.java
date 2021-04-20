package MusicPlayerCRUD;

class MainModelView {
    Database db = new Database();

    void  getSong(String title,String author, String id, MusicCategory category) {
        db.post(new Song(title, author, id, category));
    }

    void showPlaylist() {
        db.list.forEach(System.out::println);
    }

    void updateSong(int index, String title,String author, String id, MusicCategory category) {
        db.put(index, new Song(title,author, id, category));
    }

    void deleteSong(String title,String author, String id, MusicCategory category) {
        db.delete(new Song(title,author, id, category));
    }


}
