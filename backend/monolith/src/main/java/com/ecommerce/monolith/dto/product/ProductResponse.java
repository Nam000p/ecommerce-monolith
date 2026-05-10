package com.ecommerce.monolith.dto.product;

import com.ecommerce.monolith.entity.Product;

import java.util.List;

public record ProductResponse(
        Long id,
        String name,
        String description,
        Double rating,
        List<VariantResponse> variants
) {
    public static ProductResponse fromEntity(Product product) {
        return new ProductResponse(
                product.getId(),
                product.getName(),
                product.getDescription(),
                product.getRating(),
                product.getVariants() != null ?
                        product.getVariants().stream().map(VariantResponse::fromEntity).toList() :
                        List.of()
        );
    }
}