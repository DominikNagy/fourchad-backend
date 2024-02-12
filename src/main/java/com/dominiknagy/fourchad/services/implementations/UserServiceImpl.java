package com.dominiknagy.fourchad.services.implementations;

import com.dominiknagy.fourchad.dtos.requests.UserRequest;
import com.dominiknagy.fourchad.entities.User;
import com.dominiknagy.fourchad.exceptions.specific.UserNotFoundException;
import com.dominiknagy.fourchad.mappers.RequestMapper;
import com.dominiknagy.fourchad.repositories.UserRepository;
import com.dominiknagy.fourchad.services.interfaces.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User createUser(UserRequest userRequest) {
        return userRepository.save(RequestMapper.mapUser(userRequest));
    }

    @Override
    public User retrieveUserByNickname(String nickname) {
        return userRepository.findByNickname(nickname).orElseThrow(UserNotFoundException::new);
    }
}
