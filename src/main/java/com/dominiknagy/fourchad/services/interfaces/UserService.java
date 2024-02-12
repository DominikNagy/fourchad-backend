package com.dominiknagy.fourchad.services.interfaces;

import com.dominiknagy.fourchad.dtos.requests.UserRequest;
import com.dominiknagy.fourchad.entities.User;

public interface UserService {
    User retrieveUserByNickname(String nickname);
    User createUser(UserRequest userRequest);
}
