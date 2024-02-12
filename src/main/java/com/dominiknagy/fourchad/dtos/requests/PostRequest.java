package com.dominiknagy.fourchad.dtos.requests;

import lombok.Data;

@Data
public class PostRequest {
    private String boardAcronym;
    private String imageLink;
    private Long imageSize;
    private String imageResolution;
    private String title;
    private String text;
    private Boolean parent;
    private Long parentId;
    private Long replyTo;
}
