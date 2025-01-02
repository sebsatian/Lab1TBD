package com.example.Lab1TBD.MongoDB.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Timestamp;

/**
 * Es el carrito que el cliente usará para pagar multiples productos a la vez.
 */
@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "ordersMongo")  // Nombre de la colección en MongoDB
public class OrderMongo {

    @Id
    private Long order_id;  // ID ÚNICO
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Timestamp date; // Fecha en que se realizó la orden
    private String status;  // Estado de la orden (pendiente, pagada, enviada)
    private Float total;    // Total a pagar de la orden (OJO, todos los productos del cliente)
    private Long client_id; // Identificador foráneo del cliente (FK)
}
