package com.dominiknagy.fourchad.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.OffsetDateTime;
import java.util.List;

@Data
@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String acronym;
    private String title;
    private OffsetDateTime creationDateTime;
    @OneToMany
    private List<Post> post;
}
