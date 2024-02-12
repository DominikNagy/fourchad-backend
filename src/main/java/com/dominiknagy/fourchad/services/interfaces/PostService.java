package com.dominiknagy.fourchad.services.interfaces;

import com.dominiknagy.fourchad.dtos.requests.PostRequest;
import com.dominiknagy.fourchad.entities.Board;
import com.dominiknagy.fourchad.entities.Post;

import java.util.List;

public interface PostService {
    void createParentPost(PostRequest postRequest);
    void createChildPost(PostRequest postRequest);
    List<Post> retrieveParentPosts(Board board);
    List<Post> retrievePosts(Long parentId);
    void deletePost(Long postId);
}
