package com.dominiknagy.fourchad.services.interfaces;

import com.dominiknagy.fourchad.dtos.requests.BoardRequest;
import com.dominiknagy.fourchad.entities.Board;

import java.util.List;

public interface BoardService {
    Board createBoard(BoardRequest boardRequest);
    Board retrieveBoard(String acronym);
    List<Board> retrieveBoards();
}
