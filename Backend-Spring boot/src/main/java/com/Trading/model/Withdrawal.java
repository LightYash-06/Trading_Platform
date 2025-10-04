package com.Trading.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

import com.Trading.domain.WithdrawalStatus;

@Entity
@Data
public class Withdrawal {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private WithdrawalStatus status;

    private Long amount;

    @ManyToOne
    private User user;

    private LocalDateTime date;
}
