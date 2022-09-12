package db;

import tables.AbsTable;
import tables.Users;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        IDbExecutor IDbExecutor = new MySqlDbExecutor();

        AbsTable users = new Users();
        try {
            ResultSet tables = IDbExecutor.execute("show tables", true);
            boolean isTableCreated = false;
            while (tables.next()) {
                if (tables.getString(1).equals("users")) {
                    isTableCreated = true;
                    break;
                }
            }
//            if (isTableCreated) {
//                IDbExecutor.execute("drop table users", false);
           //}

                users.insert();


            } finally{
                users.getIDbExecutor().close();
            }
        }
    }
