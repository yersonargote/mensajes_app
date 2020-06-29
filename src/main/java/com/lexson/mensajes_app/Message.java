package com.lexson.mensajes_app;

/**
 *
 * @author Yerson
 */
public class Message {
    int men_id;
    String men_texto;
    String men_autor;
    String men_fecha;
    
    public Message() {}

    public Message(int men_id, String men_texto, String men_autor, String men_fecha) {
        this.men_id = men_id;
        this.men_texto = men_texto;
        this.men_autor = men_autor;
        this.men_fecha = men_fecha;
    }

    public int getMen_id() {
        return men_id;
    }

    public void setMen_id(int men_id) {
        this.men_id = men_id;
    }

    public String getMen_texto() {
        return men_texto;
    }

    public void setMen_texto(String men_texto) {
        this.men_texto = men_texto;
    }

    public String getMen_autor() {
        return men_autor;
    }

    public void setMen_autor(String men_autor) {
        this.men_autor = men_autor;
    }

    public String getMen_fecha() {
        return men_fecha;
    }

    public void setMen_fecha(String men_fecha) {
        this.men_fecha = men_fecha;
    }
    
    
}
