package MusicPlayerCRUD;

public class Main {
    public static void main(String[] args) {
        MainModelView musicList = new MainModelView();
        musicList.getSong("We will rock you","Queen", "7s238", MusicCategory.ROCK);
    }
}