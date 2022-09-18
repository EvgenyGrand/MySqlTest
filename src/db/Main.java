package db;

import tables.AbsTable;
import tables.Curator;
import tables.Group;
import tables.Student;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        IDbExecutor IDbExecutor = new MySqlDbExecutor();


        AbsTable Student = new Student();
        AbsTable Group = new Group();
        AbsTable Curator = new Curator();


        try {
            ResultSet tables = IDbExecutor.execute("show tables", true);
            boolean isTableCreated = false;
            while (tables.next()) {
                if (tables.getString(1).equals("Group")) {
                    isTableCreated = true;
                    break;
                }
            }
//            if (isTableCreated) {
//                IDbExecutor.execute("drop table users", false);
//           }
            Student.selectStudentGroup();


        } finally {
            Student.getIDbExecutor().close();
        }
    }
}
