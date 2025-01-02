package com.example.Lab1TBD.MongoDB.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "clientMongo") // Mapea la colección en MongoDB
public class UserMongo {

    @Id
    private String id; // Identificador único

    private String clientName; // Nombre del cliente
    private String email; // Correo electrónico
    private String password; // Contraseña
    private String phoneNumber; // Número de teléfono


    public UserMongo(String id, String clientName, String email, String password, String phoneNumber) {
        this.id = id;
        this.clientName = clientName;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
