package com.dominiknagy.fourchad.entities;

import com.dominiknagy.fourchad.enums.BoardType;
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
    private BoardType boardType;
    private String acronym;
    private String title;
    private OffsetDateTime creationDateTime;
    @OneToMany(mappedBy = "board", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Post> posts;
    @ManyToOne
    private User createdBy;
}
