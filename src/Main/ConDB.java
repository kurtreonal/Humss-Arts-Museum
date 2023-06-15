package Main;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConDB {

    public static Connection getConnection() throws Exception {
        String dbRoot = "jdbc:mysql://";
        String hostName = "localhost:3306/";
        String dbName = "humss_db";
        String dbURL = dbRoot + hostName + dbName;

        String hostUsername = "root";
        String hostPassword = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection myConn = (Connection) DriverManager.getConnection(dbURL, hostUsername, hostPassword);
            return myConn;
        } catch (Exception e) {
            System.err.println(e);
            return null;
        }

    }
}
