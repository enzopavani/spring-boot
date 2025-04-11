package com.enzo.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enzo.project.entities.Category;

// JpaRepo é @Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
