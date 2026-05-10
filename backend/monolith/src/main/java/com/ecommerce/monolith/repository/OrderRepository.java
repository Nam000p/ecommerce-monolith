package com.ecommerce.monolith.repository;

import com.ecommerce.monolith.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository {
    List<Order> findByUserIdOrderByCreatedAtDesc(Long userId);

    Optional<Order> findByStripePaymentIntentId(String stripePaymentIntentId);
}