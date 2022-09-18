package tables;
import java.sql.SQLException;

public class Student extends AbsTable{

    //задание № 1 вызвать метод Student.create()
    public static String requestCreate = "create table %s (id int, fio varchar(50), sex varchar (15), id_group int)";

    //задание № 2 Вызвать метод Student.insert(), последовательно добавить 15 различных записей
    public static String requestInsert = "insert %s (id, fio, sex, id_group) value ('15','Baglaeva Elena Alekseevna', 'female', '3')";
    public static String requestUpdate = " ";
    public static String requestDelete = "drop table %s";

    //задание № 5 Вызвать метод Students.selectAllStudents()
    public static String requestselect = "select student.id, student.fio, student.sex, group.name, curator.fio from mydmtest.student\n" +
            "inner join mydmtest.group on student.id_group = group.id\n" +
            "inner join mydmtest.curator on group.id_curator = curator.id";

    // задание № 6 Вызвать метод Student.selectMan()
    public static String requestCountMan ="select count(*) from student where sex = 'male' ";

    //задание № 7 Вызвать метод selectWomen()
    public static String requestWomen = "select fio from student where sex = 'female'";
    public static String requestCurator;

    // задание № 10 Вызвать метод selectStudentGroup()
    public static String recuestStudentGroup = "select fio from mydmtest.student\n" +
            "where student.id_group = (select group.id from mydmtest.group where name = 'economist')";


    public Student(){
        super("Student", requestCreate, requestInsert, requestUpdate, requestDelete, requestselect, requestCountMan, requestWomen,requestCurator, recuestStudentGroup);
    }

    @Override
    public String toString() {
        return super.toString();
    }




}
