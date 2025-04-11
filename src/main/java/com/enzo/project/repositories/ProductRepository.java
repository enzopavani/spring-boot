package com.enzo.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enzo.project.entities.Product;

// JpaRepo é @Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
