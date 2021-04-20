package MusicPlayerCRUD;

enum MusicCategory{
    RAP, ROCK, METAL, TECHNO
}

public class Song {

    String title;
    String id;
    String author;
    MusicCategory category;

    Song(String title,String author, String id, MusicCategory category) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.category = category;
    }

}
