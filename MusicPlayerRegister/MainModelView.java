package MusicPlayerRegister;

public class MainModelView {

    Database db = new Database();

    void createAccount(String login, String password) {
        User user1 = new User(login, password);
        db.post(user1);
    }

    void checkAccounts() {
        db.users.forEach(System.out::println);
    }

    void updateAccount(int index, String newLogin, String newPassword) {
        User newUser = new User(newLogin, newPassword);
        db.put(index, newUser);
    }

    void deleteAccount(String login, String password) {
        User user1 = new User(login, password);
        db.delete(user1);
    }

}
