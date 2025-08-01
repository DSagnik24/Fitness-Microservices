package com.fitnessApp.UserService.service;

import com.fitnessApp.UserService.dto.RegisterRequest;
import com.fitnessApp.UserService.dto.UserResponse;
import com.fitnessApp.UserService.model.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    public UserResponse getUserProfile(String userId) {
        User user = new User();
        user.setEmail(request.getEmail());
        user.setPassword(request.getPassword());
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
    }

    public UserResponse register(@Valid RegisterRequest request) {
    }
}
