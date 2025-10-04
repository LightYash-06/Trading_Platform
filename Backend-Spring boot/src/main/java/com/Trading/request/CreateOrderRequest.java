package com.Trading.request;

import lombok.Data;

import java.math.BigDecimal;

import com.Trading.domain.OrderType;
import com.Trading.model.Coin;


@Data
public class CreateOrderRequest {
    private String coinId;
    private double quantity;
    private OrderType orderType;
}
