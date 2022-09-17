package tables;

public class Curator extends AbsTable{
    public static   String requestCreate = "create table %s (id int, fio varchar(50))";
    public static   String requestInsert = "insert %s (id, fio ) value ('4','Dartanian')";
    public static String requestUpdate = "update %s set name = 'Karl' where id =2 ";
    public static   String requestDelete = "drop table %s";
    public static String requestSelect = "select * from Group";
    public static String requestCountMan;

    public Curator (){
        super("mydmtest.curator", requestCreate,requestInsert,requestUpdate,requestDelete,requestSelect,requestCountMan);
    }
    public String toString() {
        return super.toString();
    }



}
