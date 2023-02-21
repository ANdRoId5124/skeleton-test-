package com.example.skeleton.service;

import com.example.skeleton.Dto.RegistrationDto;
import com.example.skeleton.domain.enteties.User;
import com.example.skeleton.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User registerUser(User user){
        return userRepository.save(user);
    }
}
