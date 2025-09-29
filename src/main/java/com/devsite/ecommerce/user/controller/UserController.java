package com.devsite.ecommerce.user.controller;

import com.devsite.ecommerce.user.dto.UserRequestDTO;
import com.devsite.ecommerce.user.dto.UserResponseDTO;
import com.devsite.ecommerce.user.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/register")
@CrossOrigin
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // Método para registrar usuario
    @PostMapping
    public ResponseEntity<UserResponseDTO> registerUSer(@RequestBody UserRequestDTO userRequestDTO){
        UserResponseDTO userResponseDTO = userService.registerUSer(userRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(userResponseDTO);
    }
}
