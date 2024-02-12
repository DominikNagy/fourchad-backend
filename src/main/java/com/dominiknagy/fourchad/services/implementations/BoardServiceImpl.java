package com.dominiknagy.fourchad.services.implementations;

import com.dominiknagy.fourchad.entities.Board;
import com.dominiknagy.fourchad.exceptions.BoardNotFoundException;
import com.dominiknagy.fourchad.repositories.BoardRepository;
import com.dominiknagy.fourchad.services.interfaces.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    @Override
    public void createBoard(String acronym, String title) {
        Board board = new Board();
        board.setAcronym(acronym);
        board.setTitle(title);

        boardRepository.save(board);
    }

    @Override
    public Board retrieveBoard(String acronym) {

        return boardRepository.findByAcronym(acronym).orElseThrow(() -> new BoardNotFoundException("Board not found"));
    }

    @Override
    public List<Board> retrieveBoards() {

        return boardRepository.findAll();
    }
}
