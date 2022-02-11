package repository.userOperations;

import entity.User;
import repository.DBUserRepository;
import service.JDBCService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelectUserByUsername implements DBUserRepository {

    private static final String SELECT_USER_BY_USERNAME = "select id, name, user_name, password from users where user_name =?";

    @Override
    public User selectUserByUsername(String username) {
        User user = null;
        try (Connection connection = JDBCService.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_USERNAME)) {
            preparedStatement.setString(1, username);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String username1 = rs.getString("user_name");
                String password = rs.getString("password");
                user = new User(id, name, username1, password);
            }
        } catch (SQLException exception) {
            JDBCService.printSQLException(exception);
        }
        return user;
    }
}
