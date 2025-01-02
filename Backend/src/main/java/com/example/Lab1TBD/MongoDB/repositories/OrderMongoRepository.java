package com.example.Lab1TBD.MongoDB.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.Lab1TBD.MongoDB.models.OrderMongo;
@Repository
public interface OrderMongoRepository extends MongoRepository<OrderMongo, Long> {
    // Puedes agregar métodos personalizados aquí si es necesario
}
