package com.cp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import com.cp.entity.Product;
import com.cp.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	@Autowired
    private ProductService productService;

    @GetMapping("/{offset}/{pageSize}")
    public Page<Product> getAllProducts(@PathVariable int offset, @PathVariable int pageSize) {
        return productService.getAllProducts(offset,pageSize);
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productService.createProduct(product);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
        return productService.updateProduct(id, product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }    
}
