package com.example.Lab1TBD.MongoDB.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "order_detailsMongo") // Mapea la colección de MongoDB
public class OrderDetailMongo {

    @Id
    private String id; // ID único de MongoDB

    private int quantity; // Cantidad del producto en la orden
    private Float price; // Precio unitario del producto
    private String orderId; // ID foráneo que pertenece a la orden (FK)
    private String productId; // ID foráneo que pertenece al producto (FK)

    public OrderDetailMongo(String id, int quantity, Float price, String orderId, String productId) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.orderId = orderId;
        this.productId = productId;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
