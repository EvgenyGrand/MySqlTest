package tables;

import java.sql.SQLException;

public interface ITable {
    void create() throws SQLException;
    void delete() throws SQLException;
    void insert() throws SQLException;
    void update() throws SQLException;
    void selectAllStudents() throws SQLException;
    void selectMan() throws SQLException;
    void selectWomen() throws SQLException;
    void selectGroupCurator() throws SQLException;




}

