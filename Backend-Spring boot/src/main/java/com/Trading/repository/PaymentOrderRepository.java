package com.Trading.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Trading.model.PaymentOrder;

public interface PaymentOrderRepository extends JpaRepository<PaymentOrder,Long> {
}
