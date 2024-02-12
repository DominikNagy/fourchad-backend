package com.dominiknagy.fourchad.services.implementations;

import com.dominiknagy.fourchad.dtos.requests.BoardRequest;
import com.dominiknagy.fourchad.entities.Board;
import com.dominiknagy.fourchad.exceptions.specific.BoardNotFoundException;
import com.dominiknagy.fourchad.repositories.BoardRepository;
import com.dominiknagy.fourchad.services.interfaces.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.OffsetDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardRepository boardRepository;

    @Override
    public Board createBoard(BoardRequest boardRequest) {
        Board board = new Board();
        board.setAcronym(boardRequest.getAcronym());
        board.setTitle(boardRequest.getTitle());
        board.setCreationDateTime(OffsetDateTime.now());

        return boardRepository.save(board);
    }

    @Override
    public Board retrieveBoard(String acronym) {
        return boardRepository.findByAcronym(acronym).orElseThrow(BoardNotFoundException::new);
    }

    @Override
    public List<Board> retrieveBoards() {
        return boardRepository.findAll();
    }
}
