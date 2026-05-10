package com.ecommerce.monolith.entity;

import com.ecommerce.monolith.enums.AuthProvider;
import com.ecommerce.monolith.enums.UserRole;
import com.ecommerce.monolith.enums.UserStatus;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 100)
    private String email;

    @Column(nullable = false, length = 512)
    private String password;

    @Column(nullable = false)
    private String username;

    @Column(name = "avatar_url", length = 512)
    private String avatarUrl;

    @Column(length = 20)
    private String phone;

    private String address;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private UserRole role;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private UserStatus status;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private AuthProvider authProvider;
}