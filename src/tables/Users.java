package tables;

import java.sql.SQLException;

public class Users extends AbsTable {

    protected static String requestCreate = "create table %s (id int, name varchar(15))";
    protected static String requestInsert = "insert %s (id, name) value ('2','Vasia')";
    protected static String requestUpdate = "update %s set name = 'Karl' where id =2 ";
    protected static String requestDelete = "drop table %s";
    protected static String requestSelect = "select * from users";

    @Override
    public String toString() {
        return super.toString();
    }


    public Users() {
        super("users", requestCreate, requestInsert, requestUpdate, requestDelete, requestSelect);


    }
}
