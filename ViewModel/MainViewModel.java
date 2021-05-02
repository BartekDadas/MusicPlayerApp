package com.ViewModel;

import com.Model.*;// this constantly change back to star so there no point of keep changing it back


public class MainViewModel {

    UserDatabase userDB = new UserDatabase();
    UserCheckout userC = new UserCheckout();
    SongDatabase songDB = new SongDatabase();
    public User activeUser = null;

    public void createUser(String login, String password) {
        userDB.post(login, password);
    }

    public void deleteUser(User user) {
        userDB.delete(user);
    }

    public void login(String login, String password) {
        try {
            userC.filterLogin(login, password);
            activeUser = userDB.exist(login, password);
            System.out.println(Message.userExist);
        } catch (Exception e) {
            System.out.println(Message.userMissing);
        }
    }

    public void changeMyPassword(String login, String oldPassword, String newPassword) {
        userDB.changePassword(login, oldPassword, newPassword);
    }


//    SONG LOGIC


    public void addSongTo(Playlist playlist, Song song) {
        if(songDB.verifySong(song)) {
            playlist.post(song);
        } else {
            System.out.println(Message.missingSong);
        }
    }

    public void removeSongFrom(Playlist playlist, Song song) {
        playlist.delete(song);
    }

    public void showAllSongs() {
        songDB.list.forEach(System.out::println);
    }



//    PLAYLIST LOGIC


    public void changeTitleOf(Playlist playlist, String newTitle ) {
        playlist.changeTitle(newTitle);
    }

    public void makeNewPlaylist(String title) {
        this.activeUser.playlists.add(new Playlist(title));
    }

    public void deletePlaylist(Playlist playlist) {
        try {
            this.activeUser.playlists.remove(playlist);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showPlaylist(Playlist playlist) {
        playlist.get();
    }
}
