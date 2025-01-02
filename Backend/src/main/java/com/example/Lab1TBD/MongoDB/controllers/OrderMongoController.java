package com.example.Lab1TBD.MongoDB.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.Lab1TBD.MongoDB.models.OrderMongo;
import com.example.Lab1TBD.MongoDB.services.OrderMongoService;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderMongoController {

    @Autowired
    private OrderMongoService orderService;

    // Obtener todas las órdenes
    @GetMapping
    public List<OrderMongo> getAllOrders() {
        return orderService.getAllOrders();
    }

    // Obtener una orden por ID
    @GetMapping("/{id}")
    public ResponseEntity<OrderMongo> getOrderById(@PathVariable("id") Long orderId) {
        Optional<OrderMongo> order = orderService.getOrderById(orderId);
        return order.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Crear una nueva orden
    @PostMapping
    public ResponseEntity<OrderMongo> createOrder(@RequestBody OrderMongo orderEntity) {
        OrderMongo savedOrder = orderService.createOrder(orderEntity);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedOrder);
    }

    // Actualizar una orden existente
    @PutMapping("/{id}")
    public ResponseEntity<OrderMongo> updateOrder(@PathVariable("id") Long orderId, @RequestBody OrderMongo OrderMongo) {
        OrderMongo updatedOrder = orderService.updateOrder(orderId, OrderMongo);
        return updatedOrder != null ? ResponseEntity.ok(updatedOrder) : ResponseEntity.notFound().build();
    }

    // Eliminar una orden por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable("id") Long orderId) {
        orderService.deleteOrder(orderId);
        return ResponseEntity.noContent().build();
    }
}
