package com.example.Lab1TBD.MongoDB.controllers;

import com.example.Lab1TBD.MongoDB.services.ProductMongoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Lab1TBD.MongoDB.models.ProductMongo;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductMongoController {

    @Autowired
    private ProductMongoService productService;

    @GetMapping
    public List<ProductMongo> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public ProductMongo getProductById(@PathVariable String id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public ProductMongo saveProduct(@RequestBody ProductMongo product) {
        return productService.saveProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable String id) {
        productService.deleteProduct(id);
    }
}
