package com.dominiknagy.fourchad.dtos.responses;

import java.time.OffsetDateTime;

public class PostResponse {
    private BoardResponse board;
    private String imageLink;
    private Long imageSize;
    private String imageResolution;
    private String title;
    private String poster;
    private OffsetDateTime creationDateTime;
    private String text;
    private Boolean parent;
    private Long parentId;
    private Long replyTo;
    private UserResponse createdBy;
}
