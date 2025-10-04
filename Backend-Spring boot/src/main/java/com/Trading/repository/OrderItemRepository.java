package com.Trading.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Trading.model.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem,Long> {
}
