package com.lexson.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Yerson
 */
public class ConnectionDB {
    
    public Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/platzi", "root", "Mysqlyer@");
            if(connection != null) System.out.println("Connected");
            else System.out.println("Not connect");
        } catch(SQLException e) {
            System.out.printf("Not connect:%s%n", e.getMessage());
        }
        return connection;
    }
}
