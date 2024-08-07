package com.forcaweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.forcaweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
