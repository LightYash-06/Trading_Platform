package com.Trading.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Trading.model.Wallet;

public interface WalletRepository extends JpaRepository<Wallet,Long> {

    public Wallet findByUserId(Long userId);


}
