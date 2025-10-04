package com.Trading.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Trading.model.Coin;

public interface CoinRepository extends JpaRepository<Coin,String> {
}
