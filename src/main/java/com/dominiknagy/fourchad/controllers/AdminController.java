package com.dominiknagy.fourchad.controllers;

import com.dominiknagy.fourchad.dtos.requests.BoardRequest;
import com.dominiknagy.fourchad.dtos.responses.BoardResponse;
import com.dominiknagy.fourchad.entities.Board;
import com.dominiknagy.fourchad.mappers.ResponseMapper;
import com.dominiknagy.fourchad.services.interfaces.BoardService;
import com.dominiknagy.fourchad.services.interfaces.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/api/admin")
public class AdminController {

    private final BoardService boardService;
    private final PostService postService;

    @PostMapping("/boards")
    public ResponseEntity<Object> createBoard(@RequestBody BoardRequest boardRequest) {
        BoardResponse boardResponse = ResponseMapper.mapBoardResponse(boardService.createBoard(boardRequest));

        return ResponseEntity.status(HttpStatus.CREATED).body(boardResponse);
    }
}
