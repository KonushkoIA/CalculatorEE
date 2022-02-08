package service;

import entity.User;
import storage.InMemoryUserStorage;
import java.util.List;

public class UsernameVerificationService {

    private final InMemoryUserStorage userStorage = new InMemoryUserStorage();

    public boolean checkUsername(String username) {
        List<User> usersList = userStorage.getUsersList();
        for (User user : usersList) {
            if (user.getUsername().equals(username)){
                return false;
            }
        }
        return true;
    }
}
