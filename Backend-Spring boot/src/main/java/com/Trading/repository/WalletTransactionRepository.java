package com.Trading.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Trading.domain.WalletTransactionType;
import com.Trading.model.Wallet;
import com.Trading.model.WalletTransaction;

import java.util.List;

public interface WalletTransactionRepository extends JpaRepository<WalletTransaction,Long> {

    List<WalletTransaction> findByWalletOrderByDateDesc(Wallet wallet);

}
