package db;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
         IDbExecutor IDbExecutor = new MySqlDbExecutor();
        try {
             IDbExecutor.execute("insert users (id, name) value ('1', 'Karl')");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
