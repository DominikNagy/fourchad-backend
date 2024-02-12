package com.dominiknagy.fourchad.services.implementations;

import com.dominiknagy.fourchad.dtos.requests.PostRequest;
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
    public void createParentPost(PostRequest postRequest) {

    }

    @Override
    public void createChildPost(PostRequest postRequest) {

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
