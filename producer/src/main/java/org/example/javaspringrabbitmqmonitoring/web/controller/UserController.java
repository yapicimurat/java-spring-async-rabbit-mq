package org.example.javaspringrabbitmqmonitoring.web.controller;

import org.example.javaspringrabbitmqmonitoring.web.input.UserLoginRequest;
import org.example.javaspringrabbitmqmonitoring.web.input.UserLogoutRequest;
import org.example.javaspringrabbitmqmonitoring.web.output.UserLoginResponse;
import org.example.javaspringrabbitmqmonitoring.web.output.UserLogoutResponse;
import org.example.javaspringrabbitmqmonitoring.web.service.IUserService;
import org.example.javaspringrabbitmqmonitoring.web.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final IUserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public ResponseEntity<UserLoginResponse> login(@RequestBody UserLoginRequest loginRequest) {
        userService.login(loginRequest.getUsername(), loginRequest.getPassword());
        return ResponseEntity.ok(new UserLoginResponse(true));
    }

    @PostMapping("/logout")
    public ResponseEntity<UserLogoutResponse> logout(@RequestBody UserLogoutRequest logoutRequest) {
        userService.logout(logoutRequest.getUsername());
        return ResponseEntity.ok(new UserLogoutResponse(true));
    }
}
