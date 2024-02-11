package com.dominiknagy.fourchad.controllers;

import com.dominiknagy.fourchad.services.interfaces.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class WebController {

    private final PostService postService;

    @PostMapping("/createParentPost")
    public ResponseEntity<String> createParentPost() {
        postService.createParentPost("b", "link.to.image.com/kIajs", "First title", "Anonymous", "this is a dummy text");
        return ResponseEntity.ok("New parent post created from admin.");
    }
}
