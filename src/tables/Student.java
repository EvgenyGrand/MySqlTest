package tables;
import java.sql.SQLException;

public class Student extends AbsTable{

    public static String requestCreate = "create table %s (id int, fio varchar(50), sex varchar (15), id_group int)";
    public static String requestInsert = "insert %s (id, fio, sex, id_group) value ('15','Baglaeva Elena Alekseevna', 'female', '3')";
    public static String requestUpdate = " ";
    public static String requestDelete = "drop table %s";
    public static String requestselect = "select student.id, student.fio, student.sex, group.name, curator.fio from mydmtest.student\n" +
            "inner join mydmtest.group on student.id_group = group.id\n" +
            "inner join mydmtest.curator on group.id_curator = curator.id";
    public static String requestCountMan ="select count(*) from student where sex = 'male' ";
    public static String requestNameWomen = "select fio from student where sex = 'female'";

    public Student(){
        super("Student", requestCreate, requestInsert, requestUpdate, requestDelete, requestselect, requestCountMan);
    }

    @Override
    public String toString() {
        return super.toString();
    }




}
