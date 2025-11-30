package org.example.javaspringrabbitmqmonitoring.web.service;

import org.example.javaspringrabbitmqmonitoring.web.common.LogMessage;
import org.example.javaspringrabbitmqmonitoring.web.common.LogType;
import org.example.javaspringrabbitmqmonitoring.web.output.UserLoginResponse;
import org.example.javaspringrabbitmqmonitoring.web.output.UserLogoutResponse;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    private final LogProducer logProducer;

    public UserService(LogProducer logProducer) {
        this.logProducer = logProducer;
    }

    @Override
    public UserLoginResponse login(String username, String password) {
        logProducer.send(new LogMessage(LogType.USER_LOGIN, "User login."));
        return new UserLoginResponse(true);
    }

    @Override
    public UserLogoutResponse logout(String username) {
        logProducer.send(new LogMessage(LogType.USER_LOGOUT, "User logout."));
        return new UserLogoutResponse(true);
    }
}
