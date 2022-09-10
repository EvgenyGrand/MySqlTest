package db;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
         IDbExecutor IDbExecutor = new MySqlDbExecutor();
        try {
            //IDbExecutor.execute("create table users (id int, name varchar(15)) ", false);
           //IDbExecutor.execute("insert users (id, name) value ('3', 'Pasha')", false);
          ResultSet resultSet= IDbExecutor.execute("select * from users",true);
            while (resultSet.next()){
                System.out.println(resultSet.getString(1));
                System.out.println(resultSet.getString(2));
            }
        } finally {
            IDbExecutor.close();
        }

    }
}
