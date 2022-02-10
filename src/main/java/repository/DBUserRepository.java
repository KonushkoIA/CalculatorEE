package repository;

import entity.User;
import java.sql.SQLException;

public interface DBUserRepository {

    default void addUser(User user) throws SQLException {
    }

    default User selectUserByUsername(String username) throws SQLException {
            return null;
    }

    default void updateUserPasswordByUsername(String username, String password) throws SQLException {
    }
}
