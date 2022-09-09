package db;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IDbExecutor {
    public void execute(String sqlRequest) throws SQLException;

    }


