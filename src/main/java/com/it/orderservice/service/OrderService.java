package com.it.orderservice.service;

import com.it.orderservice.model.OrderRequest;
import com.it.orderservice.model.OrderResponse;

public interface OrderService {
    long placeOrder(OrderRequest orderRequest);

    OrderResponse getOrderDetails(long orderId);
}
