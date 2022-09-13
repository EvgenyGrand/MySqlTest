package tables;

import java.sql.SQLException;

public class Users extends AbsTable{

    public static String requestCreate = "create table %s (id int, name varchar(15))";
    public static String requestInsert = "insert %s (id, name) value ('2','Vasia')";
    public static String requestUpdate = "update %s set name = 'Karl' where id =2 ";
    public static String requestDelete = "drop table %s";
    public static String requestSelect = "select * from users";


    public Users(){
        super("users", requestCreate, requestInsert, requestUpdate, requestDelete, requestSelect);


    }
}
