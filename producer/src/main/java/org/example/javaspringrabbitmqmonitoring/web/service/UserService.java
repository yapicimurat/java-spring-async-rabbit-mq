package org.example.javaspringrabbitmqmonitoring.web.service;

import org.example.javaspringrabbitmqmonitoring.rabbitmq.DefaultLogService;
import org.example.javaspringrabbitmqmonitoring.web.common.LogType;
import org.example.javaspringrabbitmqmonitoring.web.output.UserLoginResponse;
import org.springframework.stereotype.Service;

@Service
public class UserService extends DefaultLogService implements IUserService {

    @Override
    public UserLoginResponse login(String username, String password) {
        logToFile(LogType.USER_LOGIN, username);
        return new UserLoginResponse(true);
    }

    @Override
    public void logout(String username) {

    }
}
