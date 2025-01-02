package com.example.Lab1TBD.MongoDB.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Lab1TBD.MongoDB.services.CategoryMongoService;
import com.example.Lab1TBD.MongoDB.models.CategoryMongo;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryMongoController {

    @Autowired
    private CategoryMongoService categoryService;

    // Obtener todas las categorías
    @GetMapping
    public List<CategoryMongo> getAllCategories() {
        return categoryService.getAllCategories();
    }

    // Obtener categoría por ID
    @GetMapping("/{id}")
    public CategoryMongo getCategoryById(@PathVariable String id) {
        return categoryService.getCategoryById(id);
    }

    // Guardar una nueva categoría
    @PostMapping
    public CategoryMongo saveCategory(@RequestBody CategoryMongo category) {
        return categoryService.saveCategory(category);
    }

    // Eliminar categoría por ID
    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable String id) {
        categoryService.deleteCategory(id);
    }

    // Buscar categoría por nombre
    @GetMapping("/name/{name}")
    public CategoryMongo getCategoryByName(@PathVariable String name) {
        return categoryService.getCategoryByName(name);
    }
}
