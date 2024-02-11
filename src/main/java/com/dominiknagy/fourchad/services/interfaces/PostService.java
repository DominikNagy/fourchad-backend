package com.dominiknagy.fourchad.services.interfaces;

import com.dominiknagy.fourchad.entities.Board;
import com.dominiknagy.fourchad.entities.Post;

import java.util.List;

public interface PostService {
    void createParentPost(String boardAcronym, String imageLink, String title, String poster,
                    String text);
    void createChildPost(String boardAcronym, String imageLink, String title, String poster,
                          String text, String parentId);
    void createChildPost(String boardAcronym, String imageLink, String title, String poster,
                         String text, String parentId, String replyTo);
    List<Post> retrieveParentPosts(Board board);
    List<Post> retrievePosts(Long parentId);
    void deletePost(Long postId);
}
