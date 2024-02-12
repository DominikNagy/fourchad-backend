package com.dominiknagy.fourchad.controllers;

import com.dominiknagy.fourchad.mappers.ResponseMapper;
import com.dominiknagy.fourchad.services.interfaces.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/api/boards")
public class BoardController {

    private final BoardService boardService;

    @GetMapping
    public ResponseEntity<Object> retrieveBoards() {
        var boardResponseList =
                boardService.retrieveBoards().stream().map(ResponseMapper::mapBoardResponse)
                        .collect(Collectors.toList());

        return ResponseEntity.ok(boardResponseList);
    }

    @GetMapping("/{acronym}")
    public ResponseEntity<Object> retrieveBoard(@PathVariable String acronym) {
        var boardResponse = ResponseMapper.mapBoardResponse(boardService.retrieveBoard(acronym));

        return ResponseEntity.ok(boardResponse);
    }
}
