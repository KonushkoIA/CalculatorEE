package service;

import entity.User;
import repository.userOperations.SelectUserByUsername;

public class UsernameVerificationService {

    public boolean checkUsername(String username) {
        SelectUserByUsername userByUsername = new SelectUserByUsername();
        User user = userByUsername.selectUserByUsername(username);
        if (user == null){
            return true;
        }
        return !user.getUsername().equals(username);
    }
}
