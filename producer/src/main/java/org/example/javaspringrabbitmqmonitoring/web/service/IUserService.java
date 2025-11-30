package org.example.javaspringrabbitmqmonitoring.web.service;


import org.example.javaspringrabbitmqmonitoring.web.output.UserLoginResponse;
import org.example.javaspringrabbitmqmonitoring.web.output.UserLogoutResponse;

public interface IUserService {
    UserLoginResponse login(String username, String password);

    UserLogoutResponse logout(String username);
}
