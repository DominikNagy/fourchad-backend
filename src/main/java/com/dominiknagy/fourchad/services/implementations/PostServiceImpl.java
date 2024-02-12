package com.dominiknagy.fourchad.services.implementations;

import com.dominiknagy.fourchad.dtos.requests.PostRequest;
import com.dominiknagy.fourchad.entities.Board;
import com.dominiknagy.fourchad.entities.Post;
import com.dominiknagy.fourchad.entities.User;
import com.dominiknagy.fourchad.mappers.RequestMapper;
import com.dominiknagy.fourchad.repositories.PostRepository;
import com.dominiknagy.fourchad.services.interfaces.BoardService;
import com.dominiknagy.fourchad.services.interfaces.PostService;
import com.dominiknagy.fourchad.services.interfaces.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostServiceImpl implements PostService {

    private final PostRepository postRepository;

    private final BoardService boardService;
    private final UserService userService;

    @Override
    public Post createParentPost(PostRequest postRequest) {
        Board board = boardService.retrieveBoard(postRequest.getBoardAcronym());
        User user = userService.retrieveUserByNickname("Anonymous");

        return postRepository.save(RequestMapper.mapPost(postRequest, board, user));
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
