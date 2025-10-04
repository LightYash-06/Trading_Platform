package com.Trading.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Trading.model.ForgotPasswordToken;

public interface ForgotPasswordRepository extends JpaRepository<ForgotPasswordToken,String> {
    ForgotPasswordToken findByUserId(Long userId);
}
