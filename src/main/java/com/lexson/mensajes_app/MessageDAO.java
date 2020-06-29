package com.lexson.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Yerson
 */
public class MessageDAO {
    public static void createMessageDB(Message message) {
        ConnectionDB connectionDB = new ConnectionDB();
        try(Connection connection = connectionDB.getConnection()) {
            PreparedStatement statement = null;
            String query = "insert into mensajes (men_texto, men_autor, men_fecha) values (?,?,current_timestamp())";
            statement = connection.prepareStatement(query);
            statement.setString(1, message.getMen_texto());
            statement.setString(2, message.getMen_autor());
            statement.executeUpdate();
            System.out.println("Success");
        } catch(SQLException e) {
            System.out.print("Fail: ");
            System.out.println(e.getMessage());
        }
    }
    
    public static void readMessageDB() {
        
    }
    
    public static void deleteMessageDB(int menId) {
        
    }
    
    public static void updateMessageDB(Message message) {
        
    }
}