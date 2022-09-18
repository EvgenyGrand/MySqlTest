package tables;

import db.IDbExecutor;
import db.MySqlDbExecutor;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class AbsTable implements ITable {

    protected String tableName;
    protected String requestCreate;
    protected String requestInsert;
    protected String requestUpdate;
    protected String requestDelete;
    protected String requestSelect;
    protected String requestCountMan;
    protected String requestWomen;
    protected String requestCurator;
    protected String recuestStudentGroup;


    protected db.IDbExecutor IDbExecutor;


    public IDbExecutor getIDbExecutor() {
        return IDbExecutor;
    }

    public AbsTable(String tableName, String requestCreate, String requestInsert, String requestUpdate, String requestDelete, String requestSelect, String requestCountMan, String requestWomen, String requestCurator, String recuestStudentGroup) {
        this.tableName = tableName;
        this.requestCreate = requestCreate;
        this.requestInsert = requestInsert;
        this.requestUpdate = requestUpdate;
        this.requestDelete = requestDelete;
        this.requestSelect = requestSelect;
        this.requestCountMan = requestCountMan;
        this.requestWomen = requestWomen;
        this.requestCurator = requestCurator;
        this.recuestStudentGroup = recuestStudentGroup;


        IDbExecutor = new MySqlDbExecutor();
    }

    @Override
    public void create() throws SQLException {
        IDbExecutor.execute(String.format(requestCreate, tableName), false);

    }

    @Override
    public void delete() throws SQLException {
        IDbExecutor.execute(String.format(requestDelete, tableName), false);
    }

    @Override
    public void insert() throws SQLException {
        IDbExecutor.execute(String.format(requestInsert, tableName), false);
    }

    @Override
    public void update() throws SQLException {
        IDbExecutor.execute(String.format(requestUpdate, tableName), false);
    }


    public void selectAllStudents() throws SQLException {
        ResultSet resultSet = IDbExecutor.execute(requestSelect, true);
        while (resultSet.next()) {
            System.out.println(resultSet.getInt("id"));
            System.out.println(resultSet.getString("fio"));
            System.out.println(resultSet.getString("sex"));
            System.out.println(resultSet.getString("group.name"));
            System.out.println(resultSet.getString("curator.fio"));


        }


    }

    public void select() throws SQLException{
        ResultSet resultSet = IDbExecutor.execute(requestSelect, true);
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getInt(3));
        }
    }

    public void selectMan() throws SQLException {
        ResultSet resultSet = IDbExecutor.execute(requestCountMan, true);
        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1));


        }

    }
    public void selectWomen() throws SQLException{
        ResultSet resultSet = IDbExecutor.execute(requestWomen, true);
        while (resultSet.next()){
            System.out.println(resultSet.getString(1));
        }
    }

    public void selectGroupCurator() throws SQLException{
        ResultSet resultSet = IDbExecutor.execute(requestCurator, true);
        while (resultSet.next()){
            System.out.println(resultSet.getInt(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getString(3));
        }
    }
    public void selectStudentGroup() throws SQLException{
        ResultSet resultSet = IDbExecutor.execute(recuestStudentGroup, true);
        while (resultSet.next()){
            System.out.println(resultSet.getString(1));
        }
    }
}


