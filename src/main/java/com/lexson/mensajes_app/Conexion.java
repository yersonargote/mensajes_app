package com.lexson.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Yerson
 */
public class Conexion {
    
    public Connection getConnection() {
        Connection conexion = null;
        try {
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/platzi", "root", "Mysqlyer@");
            if(conexion != null) System.out.println("Conectado");
            else System.out.println("No conectado");
        } catch(SQLException e) {
            System.out.printf("No conectado:%s%n", e.getMessage());
        }
        return conexion;
    }
}
