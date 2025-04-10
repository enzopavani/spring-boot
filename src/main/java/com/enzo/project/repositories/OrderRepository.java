package com.enzo.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enzo.project.entities.Order;

// JpaRepo é @Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
