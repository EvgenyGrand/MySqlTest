package tables;

public class Group extends AbsTable{

    //задание № 1 вызвать метод Group.create()
    public static String requestCreate = "create table %s (id int, name varchar(50), id_curator int)";

    //задание № 2 Вызвать метод Group.insert(), последовательно добавить 15 различных записей
    public static   String requestInsert = "insert %s (id, name, id_curator) value ('3','lawyers','3')";

    //задание № 8 Вызвать метод Group.update()
    public static String requestUpdate = "update mydmtest.group set id_curator = '4' where id =1 ";
    public static String requestDelete = "drop table %s";

    //Задание № 8 вызвать метод Group.select()
    public static   String requestSelect = "select * from mydmtest.group";
    public static String requestCountMan;
    public static String requestWomen;

    // Задание № 9 вызвать метод Group.selectGroupCurator()
    public static String requestCurator = "select mydmtest.group.id, mydmtest.group.name , mydmtest.curator.fio from mydmtest.group join mydmtest.curator \n" +
            "on group.id_curator = curator.id \n" +
            "group by mydmtest.group.id \n" +
            "order by mydmtest.group.id";

    public static String recuestStudentGroup;

    public Group(){
        super("mydmtest.group", requestCreate,requestInsert,requestUpdate,requestDelete,requestSelect,requestCountMan, requestWomen, requestCurator,recuestStudentGroup);
    }
    @Override
    public String toString() {
        return super.toString();
    }


}
