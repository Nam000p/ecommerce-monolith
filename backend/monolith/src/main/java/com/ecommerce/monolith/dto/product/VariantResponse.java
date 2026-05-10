package com.ecommerce.monolith.dto.product;

import com.ecommerce.monolith.entity.ProductVariant;

import java.math.BigDecimal;

public record VariantResponse(
        Long id,
        String sku,
        String variantName,
        BigDecimal price,
        Integer discountRate,
        Integer stockQuantity,
        String imageUrl
) {
    public static VariantResponse fromEntity(ProductVariant variant) {
        return new VariantResponse(
                variant.getId(),
                variant.getSku(),
                variant.getVariantName(),
                variant.getPrice(),
                variant.getDiscountRate(),
                variant.getStockQuantity(),
                variant.getImageUrl()
        );
    }
}