package com.dominiknagy.fourchad.services.implementations;

import com.dominiknagy.fourchad.entities.Board;
import com.dominiknagy.fourchad.entities.Post;
import com.dominiknagy.fourchad.repositories.BoardRepository;
import com.dominiknagy.fourchad.repositories.PostRepository;
import com.dominiknagy.fourchad.services.interfaces.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;
    private final BoardRepository boardRepository;

    @Override
    public void createParentPost(String boardAcronym, String imageLink, String title, String poster, String text) {

    }

    @Override
    public void createChildPost(String boardAcronym, String imageLink, String title, String poster, String text, String parentId) {

    }

    @Override
    public void createChildPost(String boardAcronym, String imageLink, String title, String poster, String text, String parentId, String replyTo) {

    }

    @Override
    public List<Post> retrieveParentPosts(Board board) {
        return null;
    }

    @Override
    public List<Post> retrievePosts(Long parentId) {
        return null;
    }

    @Override
    public void deletePost(Long postId) {

    }
}
