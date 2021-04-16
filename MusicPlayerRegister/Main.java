package MusicPlayerRegister;

public class Main {
    int login = 1603;
    String password1 = "password";

    void registerToPlayer(String password){
        if(password.equals(password1)){
            controlPlayList();
        } else {
             System.out.println("Wrong password\n Enter password again");
        }
    }

    void controlPlayList() {

    }
}
