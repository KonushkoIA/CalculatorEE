package repository.actionsOfOperations;

import entity.Operation;
import entity.User;
import repository.DBOperationRepository;
import service.JDBCService;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SelectAllUserOperations implements DBOperationRepository {
    private static final String SELECT_ALL_OPERATION = "select users.user_name, operations.operation from users inner join operations on users.id = operations.user_id and users.id = ?";

    @Override
    public List<Operation> selectAllUserOperations(int userId) {

        List<Operation> operations = new ArrayList<>();

        try (Connection connection = JDBCService.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_OPERATION)) {
            preparedStatement.setInt(1, userId);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                double answer = rs.getDouble("operation");
                String username = rs.getString("user_name");
                operations.add(new Operation(answer,username));
            }
        } catch (SQLException exception) {
            JDBCService.printSQLException(exception);
        }
        return operations;
    }



}
