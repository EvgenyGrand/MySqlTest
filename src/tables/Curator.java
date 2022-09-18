package tables;

public class Curator extends AbsTable{

    //задание № 1 вызвать метод Curator.create()
    public static   String requestCreate = "create table %s (id int, fio varchar(50))";

    //задание № 2 Вызвать метод Curator.insert(), последовательно добавить 15 различных записей
    public static   String requestInsert = "insert %s (id, fio ) value ('4','Dartanian')";
    public static String requestUpdate = "update %s set name = 'Karl' where id =2 ";
    public static   String requestDelete = "drop table %s";
    public static String requestSelect = "select * from Group";
    public static String requestCountMan;
    public static String requestWomen;
    public static String requestCurator;
    public static String recuestStudentGroup;

    public Curator (){
        super("mydmtest.curator", requestCreate,requestInsert,requestUpdate,requestDelete,requestSelect,requestCountMan, requestWomen,requestCurator,recuestStudentGroup);
    }
    public String toString() {
        return super.toString();
    }



}
