package com.dominiknagy.fourchad.entities;

import com.dominiknagy.fourchad.enums.UserRole;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    @OneToMany
    private List<Board> boards;
    private String nickname;
    private UserRole userRole;
}
