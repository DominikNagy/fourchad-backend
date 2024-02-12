package com.dominiknagy.fourchad.repositories;

import com.dominiknagy.fourchad.entities.Board;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface BoardRepository extends JpaRepository<Board, Long> {
    Optional<Board> findByAcronym(String acronym);

    @Query("SELECT b FROM Board b LEFT JOIN FETCH b.posts WHERE b.acronym = :acronym")
    Optional<Board> findByAcronymWithPosts(@Param("acronym") String acronym);
}
