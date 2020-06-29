package com.lexson.mensajes_app;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Yerson
 */
public class Main {
    
    final static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
       boolean exit = false;
       int option;
       
        while (!exit) {
            System.out.println("---------------------------");
            System.out.println("Aplicación de mensajes");
            System.out.println("1. Create menssage");
            System.out.println("2. List messages");
            System.out.println("3. Update message");
            System.out.println("4. Delete message");
            System.out.println("5. Salir");

            try {
                System.out.println("Escribe una de las opciones");
                option = scanner.nextInt();

                switch (option) {
                    case 1:
                        MessagesService.createMessage();
                        break;
                    case 2:
                        MessagesService.listMessages();
                        break;
                    case 3:
                        MessagesService.updateMessageDB();
                        break;
                    case 4:
                        MessagesService.deleteMessageDB();
                        break;
                    case 5:
                        exit = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 5");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                scanner.next();
            }
        }
    }
}
