package com.dominiknagy.fourchad.controllers;

import com.dominiknagy.fourchad.dtos.requests.PostRequest;
import com.dominiknagy.fourchad.mappers.ResponseMapper;
import com.dominiknagy.fourchad.services.interfaces.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/api/posts")
public class PostController {

    private final PostService postService;

    @PostMapping
    public ResponseEntity<Object> createParentPost(@RequestBody PostRequest postRequest) {
        var postResponse = ResponseMapper.mapPostResponse(postService.createParentPost(postRequest));

        return ResponseEntity.ok(postResponse);
    }
}
