package com.lexson.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Yerson
 */
public class MessageDAO {
    public static void createMessageDB(Message message) {
        ConnectionDB connectionDB = new ConnectionDB();
        PreparedStatement statement = null;
        try(Connection connection = connectionDB.getConnection()) {
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
        ConnectionDB connectionDB = new ConnectionDB();
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try(Connection connection = connectionDB.getConnection()) {
            String query = "select * from mensajes";
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();
            while(resultSet.next()) {
                System.out.printf("%s ", resultSet.getInt("men_id"));
                System.out.println(resultSet.getString("men_texto"));
            }
        } catch(SQLException e) { 
            System.out.printf("Fail:%s%n", e.getMessage());
        }
    }
    
    public static void deleteMessageDB(int menId) {
        ConnectionDB connectionDB = new ConnectionDB();
        PreparedStatement statement = null;
        try(Connection connection = connectionDB.getConnection()) {
            String query = String.format("delete from mensajes where men_id = %d", menId);
            statement = connection.prepareStatement(query);
            statement.executeUpdate();
            System.out.println("Success");
        } catch(SQLException e) {
            System.out.print("Fail: ");
            System.out.println(e.getMessage());
        }
    }
    
    public static void updateMessageDB(Message message) {
        ConnectionDB connectionDB = new ConnectionDB();
        PreparedStatement statement = null;
        try(Connection connection = connectionDB.getConnection()) {
            String query = String.format("update mensajes set men_texto = '%s' where men_id = %d", message.getMen_texto(), message.getMen_id());
            statement = connection.prepareStatement(query);
            statement.executeUpdate();
            System.out.println("Success");
        } catch(SQLException e) {
            System.out.print("Fail: ");
            System.out.println(e.getMessage());
        }
    }
}