package com.dominiknagy.fourchad.controllers;

import com.dominiknagy.fourchad.services.interfaces.BoardService;
import com.dominiknagy.fourchad.services.interfaces.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/admin")
@CrossOrigin(origins = "*")
public class AdminController {

    private final BoardService boardService;
    private final PostService postService;

    @PostMapping("/createBoard")
    public ResponseEntity<String> createBoard() {
        boardService.createBoard("b", "random");
        return ResponseEntity.ok("New board created.");
    }
}
