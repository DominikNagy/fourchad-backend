package com.dominiknagy.fourchad.mappers;

import com.dominiknagy.fourchad.dtos.responses.BoardResponse;
import com.dominiknagy.fourchad.entities.Board;

public class ResponseMapper {

    public static BoardResponse mapBoardResponse(Board board) {
        BoardResponse boardResponse = new BoardResponse();
        boardResponse.setAcronym(board.getAcronym());
        boardResponse.setTitle(board.getTitle());
        boardResponse.setCreationDateTime(board.getCreationDateTime());

        return boardResponse;
    }
}
