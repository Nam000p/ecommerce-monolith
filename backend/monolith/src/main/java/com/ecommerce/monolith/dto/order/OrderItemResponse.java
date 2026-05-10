package com.ecommerce.monolith.dto.order;

import com.ecommerce.monolith.entity.OrderItem;

import java.math.BigDecimal;

public record OrderItemResponse(
        Long variantId,
        String productName,
        String variantName,
        String imageUrl,
        Integer quantity,
        BigDecimal priceAtOrder
) {
    public static OrderItemResponse fromEntity(OrderItem item) {
        return new OrderItemResponse(
                item.getVariant().getId(),
                item.getVariant().getProduct().getName(),
                item.getVariant().getVariantName(),
                item.getVariant().getImageUrl(),
                item.getQuantity(),
                item.getPriceAtOrder()
        );
    }
}