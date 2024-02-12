package com.dominiknagy.fourchad.controllers;

import com.dominiknagy.fourchad.dtos.requests.PostRequest;
import com.dominiknagy.fourchad.services.interfaces.BoardService;
import com.dominiknagy.fourchad.services.interfaces.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class WebController {

    private final PostService postService;
    private final BoardService boardService;

    @PostMapping("/posts")
    public ResponseEntity<String> createParentPost(@RequestBody PostRequest postRequest) {
        postService.createParentPost(postRequest);
        return ResponseEntity.ok("New parent post created.");
    }

    @GetMapping("/boards")
    public ResponseEntity<Object> retrieveBoards() {
        return ResponseEntity.ok(boardService.retrieveBoards());
    }

    @GetMapping("/boards/{acronym}")
    public ResponseEntity<Object> retrieveBoard(@PathVariable String acronym) {
        return ResponseEntity.ok(boardService.retrieveBoard(acronym));
    }
}
