package tables;

public class Group extends AbsTable{
    public static String requestCreate = "create table %s (id int, name varchar(50), id_curator int)";
    public static   String requestInsert = "insert %s (id, name, id_curator) value ('3','lawyers','3')";
    public static String requestUpdate = "update %s set name = 'Karl' where id =2 ";
    public static String requestDelete = "drop table %s";
    public static   String requestSelect = "select * from Group";
    public static String requestCountMan;


    public Group(){
        super("mydmtest.group", requestCreate,requestInsert,requestUpdate,requestDelete,requestSelect,requestCountMan);
    }
    @Override
    public String toString() {
        return super.toString();
    }


}
