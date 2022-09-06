package db;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        IDbExecutor ItestDBExecutor = new MySqlDbExecutor();
        try {
            ResultSet resultset = ItestDBExecutor.execute("insert users (name, age, email) value ('Karl', 68, 'Karl@mail.ru')");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
