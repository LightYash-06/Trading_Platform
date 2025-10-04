package com.Trading.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Trading.model.PaymentDetails;

public interface PaymentDetailsRepository extends JpaRepository<PaymentDetails,Long> {

    PaymentDetails getPaymentDetailsByUserId(Long userId);
}
