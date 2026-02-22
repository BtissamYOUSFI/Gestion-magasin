package org.example.tpmagasin.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ConnectionBD {
    private static Connection connection;

    private ConnectionBD() {}

    public static Connection getInstance() {
        if(connection == null) {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection= DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/tpmagasin",
                        "root",
                        ""
                );
                Statement stmt=connection.createStatement();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
