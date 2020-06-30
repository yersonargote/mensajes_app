package com.lexson.mensajes_app;

/**
 *
 * @author Yerson
 */
public class MessagesService {
    public static void createMessage() {
        MessageDAO.createMessageDB(new Message(1, "Hola, buen día", "Yo 2.0", ""));
    }
    
    public static void listMessages() {
        MessageDAO.readMessageDB();
    }
    
    public static void readMessage() {
        
    }
    
    public static void deleteMessageDB() {
        MessageDAO.deleteMessageDB(1);
    }
    
    public static void updateMessageDB() {
        MessageDAO.updateMessageDB(new Message(1, "Hola, update desde java", "", ""));
    }
}
