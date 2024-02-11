package com.dominiknagy.fourchad.services.interfaces;

import com.dominiknagy.fourchad.entities.Board;

import java.util.List;

public interface BoardService {
    void createBoard(String acronym, String title);
    Board retrieveBoard(String acronym);
    List<Board> retrieveBoards();
}
