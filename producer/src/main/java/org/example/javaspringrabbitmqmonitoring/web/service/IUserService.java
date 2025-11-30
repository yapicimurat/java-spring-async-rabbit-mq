package org.example.javaspringrabbitmqmonitoring.web.service;


import org.example.javaspringrabbitmqmonitoring.web.output.UserLoginResponse;

public interface IUserService {
    UserLoginResponse login(String username, String password);

    void logout(String username);
}
