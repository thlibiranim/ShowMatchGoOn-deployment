package com.showmatchgoon.backend.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String username;
    private String email;
    private String password;
    private String role;
    private Integer loyaltyPoints = 0;

    @OneToMany(mappedBy = "user")
    private List<Subscription> subscriptions;
}
