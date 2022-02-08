package storage;

import entity.User;

import javax.jws.soap.SOAPBinding;
import java.util.ArrayList;
import java.util.List;

public class InMemoryUserStorage {
    private static final List<User> users = new ArrayList<>();

    public void save(User user){
        users.add(user);
    }

    public User getByUsername(String username){
        for (User user : users) {
            if (user.getUsername().equals(username)){
                return user;
            }
        }
        return null;
    }

    public List<User> getUsersList() {
        return users;
    }

}
