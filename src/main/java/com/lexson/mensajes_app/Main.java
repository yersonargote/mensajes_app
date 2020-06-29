package com.lexson.mensajes_app;

import java.sql.Connection;
import java.sql.SQLException;
/**
 *
 * @author Yerson
 */
public class Main {
    public static void main(String[] args) {
        Conexion conexion = new Conexion();
        
        try(Connection connection = conexion.getConnection()) {
            
        } catch(SQLException e) {
        }
    }
}
