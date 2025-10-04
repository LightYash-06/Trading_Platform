package com.Trading.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Trading.domain.WithdrawalStatus;
import com.Trading.model.Withdrawal;

import java.util.List;

public interface WithdrawalRepository extends JpaRepository<Withdrawal,Long> {
    List<Withdrawal> findByUserId(Long userId);
}
