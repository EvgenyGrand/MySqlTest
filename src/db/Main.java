package db;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
         IDbExecutor IDbExecutor = new MySqlDbExecutor();
        try {
            ResultSet resultset = IDbExecutor.execute("insert users (name, age, email) value ('Karl', 68, 'Karl@mail.ru')");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
