package com.lexson.mensajes_app;

/**
 *
 * @author Yerson
 */
public class MessagesService {
    public static void createMessage() {
        MessageDAO.createMessageDB(new Message(1, "Hola Mundo, desde java", "Yo 2.0", ""));
    }
    
    public static void listMessages() {
        
    }
    
    public static void readMessage() {
        
    }
    
    public static void deleteMessageDB() {
        
    }
    
    public static void updateMessageDB() {
        
    }
}
