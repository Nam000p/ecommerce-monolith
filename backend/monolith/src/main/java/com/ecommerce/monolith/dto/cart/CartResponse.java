package com.ecommerce.monolith.dto.cart;

import com.ecommerce.monolith.entity.Cart;

import java.math.BigDecimal;

public record CartResponse (
        Long id,
        Long variantId,
        String productName,
        String variantName,
        String imageUrl,
        BigDecimal price,
        Integer quantity
) {
    public static CartResponse fromEntity(Cart cart) {
        return new CartResponse(
                cart.getId(),
                cart.getVariant().getId(),
                cart.getVariant().getProduct().getName(),
                cart.getVariant().getVariantName(),
                cart.getVariant().getImageUrl(),
                cart.getVariant().getPrice(),
                cart.getQuantity()
        );
    }
}