package com.enzo.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.enzo.project.entities.OrderItem;
import com.enzo.project.entities.pk.OrderItemPK;

// JpaRepo é @Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
