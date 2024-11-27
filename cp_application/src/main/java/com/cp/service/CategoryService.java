package com.cp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.cp.entity.Category;
import com.cp.repository.CategoryRepository;

@Service
public class CategoryService {

	    @Autowired
	    private CategoryRepository categoryRepository;

	    public Page<Category> getAllCategories(int offset, int pageSize) {
	        return categoryRepository.findAll(PageRequest.of(offset, pageSize));
	    }

	    public Category getCategoryById(Long id) {
	        return categoryRepository.findById(id).get();
	    }

	    public Category createCategory(Category category) {
	        return categoryRepository.save(category);
	    }

	    public Category updateCategory(Long id, Category category) {
	        Category oldCategory = getCategoryById(id);
	        oldCategory.setName(category.getName());
	        oldCategory.setProducts(category.getProducts());
	        return categoryRepository.save(oldCategory);
	    }

	    public void deleteCategory(Long id) {
	        categoryRepository.deleteById(id);
	    }
	
}
