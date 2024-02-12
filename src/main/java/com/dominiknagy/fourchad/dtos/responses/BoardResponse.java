package com.dominiknagy.fourchad.dtos.responses;

import lombok.Data;

import java.time.OffsetDateTime;

@Data
public class BoardResponse {
    private String acronym;
    private String title;
    private OffsetDateTime creationDateTime;
}
