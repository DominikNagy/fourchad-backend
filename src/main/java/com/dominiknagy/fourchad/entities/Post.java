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
    private Board board;
    private String imageLink;
    private Long imageSize;
    private String imageResolution;
    private String title;
    private String poster;
    private OffsetDateTime dateTime;
    private String text;
    private Boolean parent;
    private Long parentId;
    private Long replyTo;
    @ManyToOne
    private User createdBy;
}
