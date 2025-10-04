package com.Trading.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Trading.model.VerificationCode;

public interface VerificationRepository extends JpaRepository<VerificationCode,Long> {
    VerificationCode findByUserId(Long userId);
}
