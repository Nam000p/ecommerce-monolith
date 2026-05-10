package com.ecommerce.monolith.dto.order;

import com.ecommerce.monolith.entity.Order;
import com.ecommerce.monolith.enums.OrderStatus;
import com.ecommerce.monolith.enums.PaymentMethod;
import com.ecommerce.monolith.enums.PaymentStatus;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.List;

public record OrderResponse(
        Long id,
        BigDecimal totalAmount,
        String shippingAddress,
        OrderStatus orderStatus,
        PaymentMethod paymentMethod,
        PaymentStatus paymentStatus,
        Instant createdAt,
        List<OrderItemResponse> items
) {
    public static OrderResponse fromEntity(Order order) {
        return new OrderResponse(
                order.getId(),
                order.getTotalAmount(),
                order.getShippingAddress(),
                order.getOrderStatus(),
                order.getPaymentMethod(),
                order.getPaymentStatus(),
                order.getCreatedAt(),
                order.getItems() != null ?
                        order.getItems().stream().map(OrderItemResponse::fromEntity).toList() :
                        List.of()
        );
    }
}