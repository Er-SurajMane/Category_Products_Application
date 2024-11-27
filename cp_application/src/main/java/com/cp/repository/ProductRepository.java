package com.cp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cp.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
