package com.example.Lab1TBD.MongoDB.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Lab1TBD.MongoDB.repositories.CategoryMongoRepository;
import com.example.Lab1TBD.MongoDB.models.CategoryMongo;
import java.util.List;

@Service
public class CategoryMongoService {

    @Autowired
    private CategoryMongoRepository categoryRepository;

    // Obtener todas las categorías
    public List<CategoryMongo> getAllCategories() {
        return categoryRepository.findAll();
    }

    // Guardar una categoría
    public CategoryMongo saveCategory(CategoryMongo category) {
        return categoryRepository.save(category);
    }

    // Buscar categoría por ID
    public CategoryMongo getCategoryById(String id) {
        return categoryRepository.findById(id).orElse(null);
    }

    // Buscar categoría por nombre
    public CategoryMongo getCategoryByName(String name) {
        return categoryRepository.findByName(name);
    }

    // Eliminar categoría
    public void deleteCategory(String id) {
        categoryRepository.deleteById(id);
    }
}
