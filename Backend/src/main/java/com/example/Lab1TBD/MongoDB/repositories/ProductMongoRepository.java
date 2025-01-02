package com.example.Lab1TBD.MongoDB.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.example.Lab1TBD.MongoDB.models.ProductMongo;
import java.util.List;

@Repository
public interface ProductMongoRepository extends MongoRepository<ProductMongo, String> {

    List<ProductMongo> findByProductName(String productName);

    List<ProductMongo> findByCategoryId(int categoryId);
}
