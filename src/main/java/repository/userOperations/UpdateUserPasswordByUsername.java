package repository.userOperations;

import entity.User;
import repository.DBUserRepository;
import service.JDBCService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateUserPasswordByUsername implements DBUserRepository {

    private static final String UPDATE_USER_BY_USERNAME = "update users set password = ? where user_name = ?";

    @Override
    public void updateUserPasswordByUsername(String username, String password) {
        try (Connection connection = JDBCService.getConnection();
             PreparedStatement statement = connection.prepareStatement(UPDATE_USER_BY_USERNAME)) {
             SelectUserByUsername userByUsername = new SelectUserByUsername();
             User user = userByUsername.selectUserByUsername(username);
             if (user != null) {
                 statement.setString(1, password);
                 statement.setString(2, username);
                 statement.executeUpdate();
             } else {
                 System.out.println("User not found!");
             }
        } catch (SQLException exception) {
            JDBCService.printSQLException(exception);
        }
    }
}
