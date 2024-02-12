package com.dominiknagy.fourchad.mappers;

import com.dominiknagy.fourchad.dtos.responses.BoardPostsResponse;
import com.dominiknagy.fourchad.dtos.responses.BoardResponse;
import com.dominiknagy.fourchad.dtos.responses.PostResponse;
import com.dominiknagy.fourchad.dtos.responses.UserResponse;
import com.dominiknagy.fourchad.entities.Board;
import com.dominiknagy.fourchad.entities.Post;
import com.dominiknagy.fourchad.entities.User;

import java.util.List;

public class ResponseMapper {

    public static BoardPostsResponse mapBoardPostsResponse(Board board) {
        BoardPostsResponse boardPostsResponse = new BoardPostsResponse();
        boardPostsResponse.setBoardInfo(mapBoardResponse(board));

        List<PostResponse> postResponses = board.getPosts().stream().map(ResponseMapper::mapPostResponse).toList();
        boardPostsResponse.setPosts(postResponses);

        return boardPostsResponse;
    }

    public static PostResponse mapPostResponse(Post post) {
        PostResponse postResponse = new PostResponse();
        postResponse.setParent(post.getParent());
        postResponse.setCreatedBy(mapUserResponse(post.getCreatedBy()));
        postResponse.setText(post.getText());
        postResponse.setTitle(post.getTitle());
        postResponse.setImageLink(post.getImageLink());
        postResponse.setImageSize(post.getImageSize());
        postResponse.setImageResolution(post.getImageResolution());
        postResponse.setReplyTo(post.getReplyTo());
        postResponse.setId(post.getId());
        postResponse.setCreationDateTime(post.getCreationDateTime());

        return postResponse;
    }

    public static BoardResponse mapBoardResponse(Board board) {
        BoardResponse boardResponse = new BoardResponse();
        boardResponse.setAcronym(board.getAcronym());
        boardResponse.setTitle(board.getTitle());
        boardResponse.setCreationDateTime(board.getCreationDateTime());

        return boardResponse;
    }

    public static UserResponse mapUserResponse(User user) {
        UserResponse userResponse = new UserResponse();
        userResponse.setUserRole(user.getUserRole());
        userResponse.setNickname(user.getNickname());

        return userResponse;
    }
}
