package repository.actionsOfOperations;

import entity.Operation;
import entity.User;
import repository.DBOperationRepository;
import service.JDBCService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddOperation implements DBOperationRepository {

    private static final String INSERT_OPERATION_SQL = "insert into operations"
            + " ( user_id, operation ) values " + " (?, ?);";

    @Override
    public void addOperation(Operation operation, User user){
        try (Connection connection = JDBCService.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_OPERATION_SQL)) {
            preparedStatement.setInt(1, user.getId());
            preparedStatement.setDouble(2, operation.getAnswer());
            preparedStatement.executeUpdate();
        } catch (SQLException exception) {
            JDBCService.printSQLException(exception);
        }
    }
}
