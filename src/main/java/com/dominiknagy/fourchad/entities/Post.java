package com.dominiknagy.fourchad.entities;

import jakarta.persistence.*;
import lombok.Data;
import java.time.OffsetDateTime;

@Data
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;
    private String imageLink;
    private Long imageSize;
    private String imageResolution;
    private String title;
    private OffsetDateTime creationDateTime;
    private String text;
    private Boolean parent;
    private Long parentId;
    private Long replyTo;
    @ManyToOne
    private User createdBy;
}
