package com.dominiknagy.fourchad.mappers;

import com.dominiknagy.fourchad.dtos.requests.PostRequest;
import com.dominiknagy.fourchad.dtos.requests.UserRequest;
import com.dominiknagy.fourchad.entities.Board;
import com.dominiknagy.fourchad.entities.Post;
import com.dominiknagy.fourchad.entities.User;
import com.dominiknagy.fourchad.enums.UserRole;

import java.time.OffsetDateTime;

public class RequestMapper {
    public static Post mapPost(PostRequest postRequest, Board board, User user) {
        Post post = new Post();
        post.setBoard(board);
        post.setParent(postRequest.getParent());
        post.setCreatedBy(user);
        post.setText(postRequest.getText());
        post.setTitle(postRequest.getTitle());
        post.setImageLink(postRequest.getImageLink());
        post.setImageSize(postRequest.getImageSize());
        post.setImageResolution(postRequest.getImageResolution());
        post.setParentId(postRequest.getParentId());
        post.setCreationDateTime(OffsetDateTime.now());
        post.setReplyTo(postRequest.getReplyTo());

        return post;
    }

    public static User mapUser(UserRequest userRequest) {
        User user = new User();
        user.setNickname(userRequest.getNickname());
        user.setBoards(null);
        user.setUserRole(UserRole.ANONYMOUS);

        return user;
    }
}
