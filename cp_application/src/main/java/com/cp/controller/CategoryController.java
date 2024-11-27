package com.cp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import com.cp.entity.Category;
import com.cp.service.CategoryService;

@RestController
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
    private CategoryService categoryService;

    @GetMapping("/{offset}/{pageSize}")
    public Page<Category> getAllCategories(@PathVariable int offset, @PathVariable int pageSize) {
        return categoryService.getAllCategories(offset,pageSize);
    }

    @GetMapping("/{id}")
    public Category getCategoryById(@PathVariable Long id) {
        return categoryService.getCategoryById(id);
    }

    @PostMapping
    public Category createCategory(@RequestBody Category category) {
        return categoryService.createCategory(category);
    }

    @PutMapping("/{id}")
    public Category updateCategory(@PathVariable Long id, @RequestBody Category category) {
        return categoryService.updateCategory(id, category);
    }

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable Long id) {
        categoryService.deleteCategory(id);
    }
    
}
