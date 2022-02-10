package repository.userOperations;

import entity.User;
import repository.DBUserRepository;
import service.JDBCService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddUser implements DBUserRepository {
    private static final String INSERT_USER_SQL = "insert into users"
            + " ( name, user_name, password ) values " + " (?, ?, ?);";

    @Override
    public void addUser(User user){
        try (Connection connection = JDBCService.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USER_SQL)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getUsername());
            preparedStatement.setString(3, user.getPassword());
            preparedStatement.executeUpdate();
        } catch (SQLException exception) {
            JDBCService.printSQLException(exception);
        }
    }
}
