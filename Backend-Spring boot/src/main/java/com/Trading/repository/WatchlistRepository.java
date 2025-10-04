package com.Trading.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Trading.model.Watchlist;

public interface WatchlistRepository extends JpaRepository<Watchlist,Long> {

    Watchlist findByUserId(Long userId);

}
