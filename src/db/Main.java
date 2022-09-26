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


        AbsTable student = new Student();
        AbsTable group = new Group();
        AbsTable curator = new Curator();


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
            student.selectAllStudents();
            student.selectMan();
            student.selectWomen();
            group.select();
            group.selectGroupCurator();
            student.selectStudentGroup();



        } finally {
            student.getIDbExecutor().close();
        }
    }
}
