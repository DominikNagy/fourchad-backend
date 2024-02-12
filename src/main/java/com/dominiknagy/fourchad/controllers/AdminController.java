package com.dominiknagy.fourchad.controllers;

import com.dominiknagy.fourchad.dtos.requests.BoardRequest;
import com.dominiknagy.fourchad.dtos.requests.UserRequest;
import com.dominiknagy.fourchad.dtos.responses.BoardResponse;
import com.dominiknagy.fourchad.mappers.ResponseMapper;
import com.dominiknagy.fourchad.services.interfaces.BoardService;
import com.dominiknagy.fourchad.services.interfaces.PostService;
import com.dominiknagy.fourchad.services.interfaces.UserService;
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
    private final UserService userService;

    @PostMapping("/boards")
    public ResponseEntity<Object> createBoard(@RequestBody BoardRequest boardRequest) {
        var boardResponse = ResponseMapper.mapBoardResponse(boardService.createBoard(boardRequest));

        return ResponseEntity.status(HttpStatus.CREATED).body(boardResponse);
    }

    @PostMapping("/users")
    public ResponseEntity<Object> createUser(@RequestBody UserRequest userRequest) {
        var userResponse = ResponseMapper.mapUserResponse(userService.createUser(userRequest));

        return ResponseEntity.status(HttpStatus.CREATED).body(userResponse);
    }
}
