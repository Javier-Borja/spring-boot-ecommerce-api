package com.devsite.ecommerce.user.service;

import com.devsite.ecommerce.user.dto.UserRequestDTO;
import com.devsite.ecommerce.user.dto.UserResponseDTO;
import com.devsite.ecommerce.user.mapper.UserMapper;
import com.devsite.ecommerce.user.model.User;
import com.devsite.ecommerce.user.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserService(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    // Registrar usuario
    public UserResponseDTO registerUSer(UserRequestDTO userRequestDTO) {
        User user = userMapper.toUser(userRequestDTO);
        User saveUser = userRepository.save(user);
        return userMapper.toUserResponseDTO(saveUser);
    }
}
