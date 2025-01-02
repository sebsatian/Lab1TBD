package com.example.Lab1TBD.MongoDB.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import com.example.Lab1TBD.MongoDB.repositories.OrderMongoRepository;
import com.example.Lab1TBD.MongoDB.models.OrderMongo;
@Service
public class OrderMongoService {

    @Autowired
    private OrderMongoRepository orderRepository;

    // Obtener todas las órdenes
    public List<OrderMongo> getAllOrders() {
        return orderRepository.findAll();
    }

    // Obtener una orden por ID
    public Optional<OrderMongo> getOrderById(Long orderId) {
        return orderRepository.findById(orderId);
    }

    // Guardar una nueva orden
    public OrderMongo createOrder(OrderMongo orderEntity) {
        return orderRepository.save(orderEntity);
    }

    // Actualizar una orden existente
    public OrderMongo updateOrder(Long orderId, OrderMongo orderEntity) {
        if(orderRepository.existsById(orderId)) {
            orderEntity.setOrder_id(orderId);  // Asegura que el ID se mantenga igual
            return orderRepository.save(orderEntity);
        }
        return null;
    }

    // Eliminar una orden por ID
    public void deleteOrder(Long orderId) {
        orderRepository.deleteById(orderId);
    }
}
