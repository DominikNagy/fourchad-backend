package com.dominiknagy.fourchad.dtos.responses;

import lombok.Data;

import java.util.List;

@Data
public class BoardPostsResponse {
    private BoardResponse boardInfo;
    private List<PostResponse> posts;
}
