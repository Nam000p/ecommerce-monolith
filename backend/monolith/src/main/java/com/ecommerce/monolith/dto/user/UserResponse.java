package com.ecommerce.monolith.dto.user;

import com.ecommerce.monolith.entity.User;
import com.ecommerce.monolith.enums.UserRole;
import com.ecommerce.monolith.enums.UserStatus;

import java.time.Instant;

public record UserResponse(
        Long id,
        String email,
        String username,
        String avatarUrl,
        String phone,
        String address,
        UserRole role,
        UserStatus status,
        Instant createdAt
) {
    public static UserResponse fromEntity(User user) {
        return new UserResponse(
                user.getId(),
                user.getEmail(),
                user.getUsername(),
                user.getAvatarUrl(),
                user.getPhone(),
                user.getAddress(),
                user.getRole(),
                user.getStatus(),
                user.getCreatedAt()
        );
    }
}