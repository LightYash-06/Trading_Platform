package com.Trading.service;

import java.util.List;

import com.Trading.domain.WalletTransactionType;
import com.Trading.model.Wallet;
import com.Trading.model.WalletTransaction;

public interface WalletTransactionService {
    WalletTransaction createTransaction(Wallet wallet,
                                        WalletTransactionType type,
                                        String transferId,
                                        String purpose,
                                        Long amount
    );

    List<WalletTransaction> getTransactions(Wallet wallet, WalletTransactionType type);

}
