package com.dominiknagy.fourchad.mappers;

import com.dominiknagy.fourchad.dtos.responses.BoardResponse;
import com.dominiknagy.fourchad.dtos.responses.UserResponse;
import com.dominiknagy.fourchad.entities.Board;
import com.dominiknagy.fourchad.entities.User;

public class ResponseMapper {

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
