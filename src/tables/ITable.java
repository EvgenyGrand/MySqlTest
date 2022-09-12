package tables;

import java.sql.SQLException;

public interface ITable {
    void create() throws SQLException;
    void delete() throws SQLException;
    void insert() throws SQLException;
    void update() throws SQLException;
    void select() throws SQLException;

}

