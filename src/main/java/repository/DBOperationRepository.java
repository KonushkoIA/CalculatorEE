package repository;

import entity.Operation;
import entity.User;

import java.sql.SQLException;
import java.util.List;

public interface DBOperationRepository {

    default void addOperation(Operation operation, User user) throws SQLException {
    }

    default List<Operation> selectAllUserOperations(int userId) throws SQLException{
        return null;
    }
}
