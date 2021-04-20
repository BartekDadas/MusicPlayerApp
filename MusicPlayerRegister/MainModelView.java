package MusicPlayerRegister;

public class MainModelView {

    Database db = new Database();

    void createAccount(String login, String password) {
        db.post(new User(login,password));
    }

    void checkAccounts() {
        db.users.forEach(System.out::println);
    }

    void updateAccount(int index, String newLogin, String newPassword) {
        db.put(index, new User(newLogin, newPassword));
    }

    void deleteAccount(String login, String password) {
        db.delete(new User(login, password));
    }

}
