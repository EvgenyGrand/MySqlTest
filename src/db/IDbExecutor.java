package db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;

public interface IDbExecutor {
    public ResultSet execute(String sqlRequest, boolean isResult) throws SQLException;
    void close() throws SQLException;

    }


