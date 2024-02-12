package com.dominiknagy.fourchad.dtos.responses;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class PostResponse {
    private Long id;
    private String imageLink;
    private Long imageSize;
    private String imageResolution;
    private String title;
    private OffsetDateTime creationDateTime;
    private String text;
    private Boolean parent;
    private Long parentId;
    private Long replyTo;
    private UserResponse createdBy;
}
