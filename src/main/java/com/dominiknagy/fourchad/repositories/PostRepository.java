package com.dominiknagy.fourchad.repositories;

import com.dominiknagy.fourchad.entities.Board;
import com.dominiknagy.fourchad.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PostRepository extends JpaRepository<Post, Long> {
    Optional<List<Post>> findAllByBoard(Board board);
}
