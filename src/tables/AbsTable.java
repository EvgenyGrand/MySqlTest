package tables;

import db.IDbExecutor;
import db.MySqlDbExecutor;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class AbsTable implements ITable{

    protected String tableName;
    protected String requestCreate;
    protected String requestInsert;
    protected String requestUpdate;
    protected String requestDelete;
    protected String requestSelect;


    protected db.IDbExecutor IDbExecutor;



    public IDbExecutor getIDbExecutor(){
        return IDbExecutor;
    }

    public AbsTable(String tableName, String requestCreate, String  requestInsert, String requestUpdate, String requestDelete, String requestSelect ) {
    this.tableName = tableName;
    this.requestCreate = requestCreate;
    this.requestInsert = requestInsert;
    this.requestUpdate = requestUpdate;
    this.requestDelete = requestDelete;
    this.requestSelect = requestSelect;

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

    public void select() throws SQLException{
        ResultSet resultSet= IDbExecutor.execute(requestSelect,true);
        while (resultSet.next()){
            System.out.println(resultSet.getString(1));
            System.out.println(resultSet.getString(2));
        }
    }
}
