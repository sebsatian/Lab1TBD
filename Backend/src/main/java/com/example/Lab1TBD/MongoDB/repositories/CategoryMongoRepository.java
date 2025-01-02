package com.example.Lab1TBD.MongoDB.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.Lab1TBD.MongoDB.models.CategoryMongo;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryMongoRepository extends MongoRepository<CategoryMongo, String> {

    // Buscar categoría por nombre
    CategoryMongo findByName(String name);
}