package com.sh.numble.mybox.service;

import com.sh.numble.mybox.entity.User;
import com.sh.numble.mybox.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    public User getUserInfo(String userId) {
        return userRepository.findByUserId(userId);
    }
}
