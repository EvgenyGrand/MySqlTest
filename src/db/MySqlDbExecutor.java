package db;

import utils.resources.IResource;
import utils.resources.PropirtiesReader;

import java.sql.*;
import java.util.Map;


    public class MySqlDbExecutor implements IDbExecutor {

        @Override
        public void execute(String sqlRequest) throws SQLException {
            IResource resource = new PropirtiesReader();

            Map<String, String> props = resource.read();

            String url = String.format("%s/%s", props.get("url"), props.get("db_name"));

            Connection connection = null;
            Statement statement = null;

            try {
                connection = DriverManager.getConnection(url, props.get("user"), props.get("password"));
                statement = connection.createStatement();

                statement.execute(sqlRequest);

//                return resultSet;

            } finally {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            }
        }
}
